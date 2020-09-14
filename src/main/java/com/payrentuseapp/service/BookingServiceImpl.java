package com.payrentuseapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payrentuseapp.model.Booking;
import com.payrentuseapp.model.User;
import com.payrentuseapp.model.Vehicle;
import com.payrentuseapp.repository.BookingRepository;
import com.payrentuseapp.repository.UserRepository;
import com.payrentuseapp.repository.VehicleRepository;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	@Override
	public Booking updateBooking(Long vehicleId, Long userId, Booking booking) {
		Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
		User user = userRepository.findById(userId).get();
		booking.setVehicleId(vehicle);
		booking.setUserId(user);
		return bookingRepository.save(booking);
	}
	
	@Override
	public List<Booking> getBookings(){
		
		return bookingRepository.findAll();
	}
	
	@Override
	public Booking getBookingById(Long bookingId) {
		return bookingRepository.findById(bookingId).get();
	}
	
	@Override
	public void deleteBooking(Long bookingId) {
		 bookingRepository.deleteById(bookingId);
	}
	
	@Override
	public Booking addBooking(Long vehicleId,Long userId, Booking booking) {
		Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
		User user = userRepository.findById(userId).get();
		booking.setVehicleId(vehicle);
		booking.setUserId(user);
		return bookingRepository.save(booking);
	}
	
	@Override
	public List<Booking> getBookingsByVehicleId(Long vehicleId) {
		List<Booking> bookings = new ArrayList<>();
		List<Booking> listOfbookings = bookingRepository.findAll();
		for(Booking booking:listOfbookings) {
			if(booking.getVehicleId().getId()==vehicleId) {
				bookings.add(booking);
				System.out.println(booking);
			}
		}
		return bookings;
	}


}
