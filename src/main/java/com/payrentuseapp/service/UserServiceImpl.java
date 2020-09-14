package com.payrentuseapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payrentuseapp.model.User;
import com.payrentuseapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User AddUser(User user) {
		user.setRole("ROLE_USER");
		return userRepository.save(user);
	}
	
	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}
	
	@Override
	public User getUserById(Long userId) {
		
		return userRepository.findById(userId).get();
	}
	
	@Override
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}
	
	@Override
	public User getUserByEmail(String email, String password) {
		List<User> users = userRepository.findAll();
		for(User user:users) {
			if(email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword())) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public void deleteUser(Long userId) {
		
		userRepository.deleteById(userId);
	}

}
