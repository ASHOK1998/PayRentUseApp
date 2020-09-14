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

import com.payrentuseapp.model.Vehicle;
import com.payrentuseapp.service.VehicleService;

@RestController
public class VehicleRestController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping("/vendors/{vendorId}/vehicles")
	public Vehicle addVehicle(@PathVariable("vendorId") Long vendorId, @RequestBody Vehicle vehicle) {
		
		return vehicleService.addVehicle(vendorId, vehicle);
	}
	
	@PutMapping("/vendors/{vendorId}/vehicles")
	public Vehicle updateVehicle(@PathVariable("vendorId") Long vendorId, @RequestBody Vehicle vehicle) {
		
		return vehicleService.updateVehicle(vendorId, vehicle);
	}
	
	@GetMapping("/vehicles/{vehicleId}")
	public Vehicle getVehicleById(@PathVariable("vehicleId") Long vehicleId) {
		
		
		return vehicleService.getVehicleById(vehicleId);
	}
	
	@GetMapping("/vehicles")
	public List<Vehicle> getVehicles() {
		return vehicleService.getVehicles();
	}
	
	@DeleteMapping("/vendors/{vendorId}/vehicles/{vehicleId}")
	public void deleteVehicle(@PathVariable("vehicleId") Long vehicleId) {
		
		vehicleService.deleteVehicle(vehicleId);;
	}
	
	@GetMapping("/vendors/{vendorId}/vehicles")
	public List<Vehicle> getVehicleByVendorId(@PathVariable("vendorId") Long vendorId){
		return vehicleService.getVehicleByVendorId(vendorId);
	}

}
