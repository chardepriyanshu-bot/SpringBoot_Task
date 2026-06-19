package com.pc.repository;

import org.springframework.data.repository.CrudRepository;

import com.pc.entity.Product;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}
