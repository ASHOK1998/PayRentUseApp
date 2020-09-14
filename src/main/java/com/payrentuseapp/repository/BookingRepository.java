package com.payrentuseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payrentuseapp.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	
	
}
