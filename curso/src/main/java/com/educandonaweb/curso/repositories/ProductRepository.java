package com.educandonaweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandonaweb.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

    
} 
 