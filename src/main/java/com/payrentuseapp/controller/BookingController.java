package com.payrentuseapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.payrentuseapp.model.Booking;
import com.payrentuseapp.model.User;
import com.payrentuseapp.model.Vehicle;
import com.payrentuseapp.service.BookingService;
import com.payrentuseapp.service.VehicleService;

@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private VehicleService vehicleService;
	
	
	@GetMapping("/vehicles/{vehicleId}/bookings")
	public String getBookingsByVehicleId(@PathVariable("vehicleId") Long vehicleId,Model m) {
		Vehicle vehicle = vehicleService.getVehicleById(vehicleId);
		List<Booking> bookings = bookingService.getBookingsByVehicleId(vehicleId);
		m.addAttribute("vendorId",vehicle.getVendor().getId());
		if(bookings.size()>0) {
			m.addAttribute("bookings",bookings);
         return "list_of_bookings";
		}
		
        return "bookings_empty";
	}
	
	
	@GetMapping("/vehicles/{vehicleId}/showBookingForm")
	public String showBookingForm(@PathVariable("vehicleId") Long vehicleId, Model m) {
		Vehicle vehicle = vehicleService.getVehicleById(vehicleId);
		Booking booking = new Booking();
		booking.setVehicleId(vehicle);
		m.addAttribute("booking",booking);
		return "booking_form";
	}
	
	@PostMapping("/calculateTotal")
	public String calculateTotal(@ModelAttribute("booking") Booking booking, Model m) {
		System.out.println(booking);
		booking.setTotalAmount(booking.getNoOfHours() * booking.getVehicleId().getRentPerHour());
		m.addAttribute("booking",booking);
		return "booking_payment_form";
	}
	
	@PostMapping("/addToBookings")
	public String conformBooking(@ModelAttribute("booking") Booking booking,HttpSession session) {
		System.out.println(booking);
		Vehicle vehicle = booking.getVehicleId();
		vehicle.setActive(false);
		vehicleService.updateVehicle(vehicle.getVendor().getId(), vehicle);
		User user = (User) session.getAttribute("user");
		System.out.println(user);
		booking.setUserId(user);
		bookingService.addBooking(booking.getVehicleId().getId(), user.getId(), booking);
		return "booking_confirmation";
	}
}
