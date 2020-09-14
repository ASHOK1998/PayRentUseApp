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

import com.payrentuseapp.model.Vendor;
import com.payrentuseapp.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/showVendorForm")
	public String showForm(Model model) {
	    Vendor vendor = new Vendor();
	    
	     
	    model.addAttribute("vendor", vendor);
	    
	    
	    return "vendor_register_form";
	}
	
	@PostMapping("/vendorRegister")
	public String submitForm(@ModelAttribute("vendor") Vendor vendor) {
	     
	    System.out.println(vendor);
	    
	    vendorService.addVendor(vendor);
	    return "redirect:/getVendors";
	}
	
	@PostMapping("/editVendor")
	public String editVendor(@ModelAttribute("vendor") Vendor vendor) {
		
		System.out.println(vendor);
		vendorService.updateVendor(vendor);
		return "redirect:/getVendors";
	}
	
	@GetMapping("/getVendors")
	public ModelAndView getVendors() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list_of_vendors");
		List<Vendor> vendors = vendorService.getVendors();
		mv.addObject("vendors",vendors);
		return mv;
	}
	
	@GetMapping("/showVendorEditForm/{vendorId}")
	public String showEditForm(@PathVariable("vendorId") Long vendorId,Model m) {
		Vendor vendor = vendorService.getVendorById(vendorId);
		m.addAttribute("vendor",vendor);
		return "edit_vendor";
	}
	
	@GetMapping("/deleteVendor/{vendorId}")
	public String deleteUser(@PathVariable("vendorId") Long vendorId) {
		vendorService.deleteVendor(vendorId);
		return "redirect:/getVendors";
	}
	
	

}
