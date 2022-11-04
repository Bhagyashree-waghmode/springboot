package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, String> {

}
