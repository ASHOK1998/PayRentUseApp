package com.payrentuseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payrentuseapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
