package com.payrentuseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payrentuseapp.model.Vendor;


public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
