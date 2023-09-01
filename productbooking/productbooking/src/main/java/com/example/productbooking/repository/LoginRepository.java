package com.example.productbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productbooking.entity.UserLogin;

public interface LoginRepository extends JpaRepository<UserLogin,Integer>{
	

}