package com.bessada.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bessada.webservicesspring.entities.Category;
import com.bessada.webservicesspring.entities.Product;
import com.bessada.webservicesspring.entities.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
