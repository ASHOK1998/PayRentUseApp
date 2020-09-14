package com.payrentuseapp.service;

import java.util.List;

import com.payrentuseapp.model.Booking;

public interface BookingService {

	Booking updateBooking(Long vehicleId, Long userId, Booking booking);

	List<Booking> getBookings();

	Booking getBookingById(Long bookingId);

	void deleteBooking(Long bookingId);

	Booking addBooking(Long vehicleId, Long userId, Booking booking);

	List<Booking> getBookingsByVehicleId(Long vehicleId);

}
