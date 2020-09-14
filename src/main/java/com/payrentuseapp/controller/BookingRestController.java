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

import com.payrentuseapp.model.Booking;
import com.payrentuseapp.service.BookingServiceImpl;

@RestController
public class BookingRestController {

	@Autowired
	private BookingServiceImpl bookingService;
	
	
	
	@PutMapping("vehicles/{vehicleId}/users/{userId}/bookings")
	public Booking updateBooking(@PathVariable("vehicleId") Long vehicleId, @PathVariable("userId") Long userId, @RequestBody Booking booking) {
		
		return bookingService.updateBooking(vehicleId, userId, booking);
	}
	
	@GetMapping("/bookings")
	public List<Booking> getBookings(){
		
		return bookingService.getBookings();
	}
	
	@GetMapping("/bookings/{bookingId}")
	public Booking getBookingById(@PathVariable("bookingId") Long bookingId) {
		return bookingService.getBookingById(bookingId);
	}
	
	@DeleteMapping("/bookings/{bookingId}")
	public void deleteBooking(@PathVariable("bookingId") Long bookingId) {
		bookingService.deleteBooking(bookingId);
	}
	
	@PostMapping("vehicles/{vehicleId}/users/{userId}/bookings")
	public Booking addBooking(@PathVariable("vehicleId") Long vehicleId, @PathVariable("userId") Long userId, @RequestBody Booking booking) {
		
		return bookingService.addBooking(vehicleId, userId, booking);
	}
	
}
