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

import com.payrentuseapp.model.Vehicle;
import com.payrentuseapp.service.VehicleService;
import com.payrentuseapp.service.VendorService;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private VendorService vendorService;

	@GetMapping("vendors/{vendorId}/showVehicleForm")
	public String showForm(@PathVariable("vendorId") Long vendorId, Model model) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVendor(vendorService.getVendorById(vendorId));
		model.addAttribute("vehicle", vehicle);

		return "vehicle_register_form";
	}

	@PostMapping("/vehicleRegister")
	public String submitForm(@ModelAttribute("vehicle") Vehicle vehicle) {

		System.out.println(vehicle);
		Long vendorId = vehicle.getVendor().getId();
		vehicleService.addVehicle(vehicle.getVendor().getId(), vehicle);
		return "redirect:/vendors/"+vendorId+"/getVehicles";
	}

	@PostMapping("/editVehicle")
	public String editVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
		Long vendorId = vehicle.getVendor().getId();
		vehicleService.updateVehicle(vendorId, vehicle);
		return "redirect:/vendors/" + vendorId + "/getVehicles";
	}

	@GetMapping("/vendors/{vendorId}/getVehicles")
	public ModelAndView getVehiclesByVendorId(@PathVariable("vendorId") Long vendorId) {
		List<Vehicle> vehicles = vehicleService.getVehicleByVendorId(vendorId);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list_of_vehicles");
		mv.addObject("vehicles", vehicles);
		return mv;
	}

	@GetMapping("/showVehicleEditForm/{vehicleId}")
	public String showEditForm(@PathVariable("vehicleId") Long vehicleId, Model m) {
		Vehicle vehicle = vehicleService.getVehicleById(vehicleId);
		m.addAttribute("vehicle", vehicle);
		return "edit_vehicle";
	}

	@GetMapping("/deleteVehicle/{vehicleId}")
	public String deleteVehicle(@PathVariable("vehicleId") Long vehicleId) {
		Long vendorId = vehicleService.getVehicleById(vehicleId).getVendor().getId();
		vehicleService.deleteVehicle(vehicleId);
		return "redirect:/vendors/" + vendorId + "/getVehicles";
	}
	
	@GetMapping("/getVehicles")
	public ModelAndView getVehicles() {
		ModelAndView mv = new ModelAndView();
		List<Vehicle> vehicles = vehicleService.getVehicles();
		mv.addObject("vehicles",vehicles);
		mv.setViewName("list_of_vehicles_available");
		return mv;
	}
}
