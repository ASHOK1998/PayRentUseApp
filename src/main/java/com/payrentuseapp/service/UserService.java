package com.payrentuseapp.service;

import java.util.List;

import com.payrentuseapp.model.User;

public interface UserService {

	User AddUser(User user);

	User updateUser(User user);

	User getUserById(Long userId);

	List<User> getUsers();

	void deleteUser(Long userId);

	User getUserByEmail(String email, String password);

}
