// src/main/java/com/example/orderservice/repository/OrderRepository.java
package com.example.orderservice.repository;

import com.example.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}