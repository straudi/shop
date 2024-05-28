package com.shop.repository;

import com.shop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReposioty extends JpaRepository<Order, Long> {
}
