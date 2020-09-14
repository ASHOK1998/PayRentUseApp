package com.payrentuseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payrentuseapp.model.User;
import com.payrentuseapp.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User AddUser(@RequestBody User user) {
		
		
		user.setRole("ROLE_USER");
		return userService.AddUser(user);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		
		return userService.updateUser(user);
	}
	
	@GetMapping("/users/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		
		return userService.getUserById(userId);
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		
		return userService.getUsers();
	}
	
	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		
		userService.deleteUser(userId);
	}

}
