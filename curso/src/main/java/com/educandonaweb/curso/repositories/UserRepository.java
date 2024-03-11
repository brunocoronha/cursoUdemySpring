package com.educandonaweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandonaweb.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

    
} 
 