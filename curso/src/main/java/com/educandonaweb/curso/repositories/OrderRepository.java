package com.educandonaweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandonaweb.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

    
} 
 