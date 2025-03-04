package com.example.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	// Method to find a user by user name
	Optional<User> findByUsername(String userName);
}
