package com.payrentuseapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.payrentuseapp.model.User;
import com.payrentuseapp.model.Vendor;
import com.payrentuseapp.service.UserService;
import com.payrentuseapp.service.VendorService;

@Controller
public class LoginServiceController {
	
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/showLoginAdminForm")
	public String showLoginAdminForm() {
		return "admin_login";
	}
	
	@PostMapping("/loginAdmin")
	public String loginAsAdmin(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(email.equalsIgnoreCase("admin@gmail.com") && password.equals("admin@123")) {
			return "redirect:/getVendors";
		}
		request.setAttribute("message", "Invalid Credentials");
		return "admin_login";
	}

	@GetMapping("/showLoginVendorForm")
	public String showLoginForm() {
		return "vendor_login";
	}
	
	@PostMapping("/loginVendor")
	public String loginVendor(HttpServletRequest request, HttpSession session) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Vendor vendor = vendorService.getVendorsByEmail(email, password);
		if(vendor!=null) {
			session.setAttribute("vendor", vendor);
			return "redirect:/vendors/"+vendor.getId()+"/getVehicles";
		}
		request.setAttribute("message", "Invalid Credentials");
		return "vendor_login";
	}
	
	@GetMapping("/showLoginUserForm")
	public String showLoginUserForm() {
		return "user_login";
	}
	
	@PostMapping("/loginUser")
	public String loginUser(HttpServletRequest request, HttpSession session) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = userService.getUserByEmail(email, password);
		if(user!=null) {
			session.setAttribute("user", user);
			return "redirect:/getVehicles";
		}
		request.setAttribute("message", "Invalid Credentials");
		return "user_login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "home";
	}
	 
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}
