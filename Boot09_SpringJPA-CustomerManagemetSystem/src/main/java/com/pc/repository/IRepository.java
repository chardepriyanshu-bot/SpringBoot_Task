package com.pc.repository;

import org.springframework.data.repository.CrudRepository;

import com.pc.entity.Customer;

public interface IRepository extends CrudRepository<Customer, Integer> {

}
