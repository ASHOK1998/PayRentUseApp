package com.payrentuseapp.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payrentuseapp.model.Vehicle;
import com.payrentuseapp.model.Vendor;
import com.payrentuseapp.repository.VehicleRepository;
import com.payrentuseapp.repository.VendorRepository;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private VendorRepository vendorRepository;
	
	@Override
	public Vehicle addVehicle(Long vendorId, Vehicle vehicle) {
		Vendor vendor = vendorRepository.findById(vendorId).get();
		vehicle.setVendor(vendor);
		return vehicleRepository.save(vehicle);
	}
	
	@Override
	public Vehicle updateVehicle(Long vendorId,Vehicle vehicle) {
		Vendor vendor = vendorRepository.findById(vendorId).get();
		vehicle.setVendor(vendor);
		return vehicleRepository.save(vehicle);
	}
	
	@Override
	public Vehicle getVehicleById(Long vehicleId) {
		Vehicle vehicle = null;
		try {
		vehicle = vehicleRepository.findById(vehicleId).get();
		}catch(NoSuchElementException ex) {
			ex.getMessage();
		}
		
		
		return vehicle;
	}
	
	
	@Override
	public List<Vehicle> getVehicles() {
		return vehicleRepository.findAll().stream().filter(x -> x.isActive()==true).collect(Collectors.toList());
	}
	
	@Override
	public void deleteVehicle(Long vehicleId) {
		
		vehicleRepository.deleteById(vehicleId);
	}
	
	@Override
	public List<Vehicle> getVehicleByVendorId(Long vendorId){
		return vehicleRepository.findByVendorId(vendorId);
	}

}
