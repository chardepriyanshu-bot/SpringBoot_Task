package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Order;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
