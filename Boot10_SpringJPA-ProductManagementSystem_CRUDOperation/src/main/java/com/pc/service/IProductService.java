package com.pc.service;

import java.util.Optional;

import com.pc.entity.Product;

public interface IProductService {
	public String insertProduct(Product product);
	public Iterable<Product> getAllProducts();
	public Optional<Product> findProductById(Integer id);
	public String deleteProductById(Integer id);
}
