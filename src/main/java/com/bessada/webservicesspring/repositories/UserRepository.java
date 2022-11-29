package com.bessada.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bessada.webservicesspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
