package com.cursojava.jpawebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.jpawebservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}