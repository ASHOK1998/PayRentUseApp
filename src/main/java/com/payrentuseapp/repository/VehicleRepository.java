package com.payrentuseapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.payrentuseapp.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	 
	List<Vehicle> findByVendorId(@RequestParam("id") Long id);
	
	
	
}
