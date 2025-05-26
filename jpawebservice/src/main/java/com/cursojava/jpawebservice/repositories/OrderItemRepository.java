package com.cursojava.jpawebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.jpawebservice.entities.OrderItem;
import com.cursojava.jpawebservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}