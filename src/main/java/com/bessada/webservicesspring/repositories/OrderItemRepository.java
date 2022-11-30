package com.bessada.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bessada.webservicesspring.entities.OrderItem;
import com.bessada.webservicesspring.entities.User;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
