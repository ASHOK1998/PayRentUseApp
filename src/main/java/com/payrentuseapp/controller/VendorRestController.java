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

import com.payrentuseapp.model.Vendor;
import com.payrentuseapp.service.VendorService;

@RestController
public class VendorRestController {
	
	@Autowired
	private VendorService vendorService;
	
	@PostMapping("/vendors")
	public Vendor addVendor(@RequestBody Vendor vendor) {
		
		return vendorService.addVendor(vendor);
	}
	
	@PutMapping("/vendors")
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		
		return vendorService.updateVendor(vendor);
	}
	
	@GetMapping("/vendors/{vendorId}")
	public Vendor getVendorById(@PathVariable("vendorId") Long vendorId) {
		return vendorService.getVendorById(vendorId);
	}
	
	@GetMapping("/vendors")
	public List<Vendor> getVendors() {
		return vendorService.getVendors();
	}
	
	@DeleteMapping("/vendors/{vendorId}")
	public void deleteVendor(@PathVariable("vendorId") Long vendorId) {
		
		vendorService.deleteVendor(vendorId);
	}
	
}
