package com.payrentuseapp.service;

import java.util.List;

import com.payrentuseapp.model.Vendor;

public interface VendorService {

	Vendor addVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	Vendor getVendorById(Long vendorId);

	List<Vendor> getVendors();

	void deleteVendor(Long vendorId);

	Vendor getVendorsByEmail(String email, String password);

}
