package com.bessada.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bessada.webservicesspring.entities.Order;
import com.bessada.webservicesspring.entities.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
