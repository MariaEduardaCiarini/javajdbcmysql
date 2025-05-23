package com.cursojava.jpawebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.jpawebservice.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}