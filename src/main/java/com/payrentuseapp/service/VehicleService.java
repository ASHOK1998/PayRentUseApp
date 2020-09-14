package com.payrentuseapp.service;

import java.util.List;

import com.payrentuseapp.model.Vehicle;

public interface VehicleService {

	Vehicle addVehicle(Long vendorId, Vehicle vehicle);

	Vehicle updateVehicle(Long vendorId, Vehicle vehicle);

	Vehicle getVehicleById(Long vehicleId);

	List<Vehicle> getVehicles();

	void deleteVehicle(Long vehicleId);

	List<Vehicle> getVehicleByVendorId(Long vendorId);

}
