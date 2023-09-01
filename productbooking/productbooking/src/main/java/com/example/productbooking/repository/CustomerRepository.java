package com.example.productbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productbooking.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}