package com.educandonaweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandonaweb.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    
} 
 