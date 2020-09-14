package com.payrentuseapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payrentuseapp.model.Vendor;
import com.payrentuseapp.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService{

	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public Vendor addVendor(Vendor vendor) {
		
		return vendorRepository.save(vendor);
	}
	
	@Override
	public Vendor updateVendor(Vendor vendor) {
		
		return vendorRepository.save(vendor);
	}
	
	@Override
	public Vendor getVendorById(Long vendorId) {
		return vendorRepository.findById(vendorId).get();
	}
	
	@Override
	public List<Vendor> getVendors() {
		return vendorRepository.findAll();
	}
	
	@Override
	public void deleteVendor(Long vendorId) {
		
		vendorRepository.deleteById(vendorId);
	}
	
	@Override
	public Vendor getVendorsByEmail(String email, String password) {
		List<Vendor> vendors = vendorRepository.findAll();
		for(Vendor vendor:vendors) {
			if(email.equalsIgnoreCase(vendor.getEmail()) && password.equals(vendor.getPassword())) {
				return vendor;
			}
		}
		return null;
	}
	

}
