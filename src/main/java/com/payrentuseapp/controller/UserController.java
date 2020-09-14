package com.payrentuseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.payrentuseapp.model.User;
import com.payrentuseapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/showUserForm")
	public String showForm(Model model) {
	    User user = new User();
	    
	     
	    model.addAttribute("user", user);
	    
	    
	    return "user_register_form";
	}
	
	@PostMapping("/userRegister")
	public String submitForm(@ModelAttribute("user") User user) {
	     
	    System.out.println(user);
	    
	    userService.AddUser(user);
	    return "user_register_success";
	}
	
	
	@PostMapping("/editUser")
	public String editUser(@ModelAttribute("user") User user) {
		
		System.out.println(user);
		userService.updateUser(user);
		return "redirect:/getUsers";
	}
	
	@GetMapping("/getUsers")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list_of_users");
		List<User> listOfusers = userService.getUsers();
		mv.addObject("listOfusers",listOfusers);
		return mv;
	}
	
	@GetMapping("/showEditForm/{id}")
	public String showEditForm(@PathVariable("id") Long id,Model m) {
		User user = userService.getUserById(id);
		m.addAttribute("user",user);
		return "edit_user";
	}
	
	@GetMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable("userId") Long userId) {
		userService.deleteUser(userId);
		return "redirect:/getUsers";
	}
}
