package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
