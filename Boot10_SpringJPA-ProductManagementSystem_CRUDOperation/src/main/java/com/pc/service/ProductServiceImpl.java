package com.pc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.Product;
import com.pc.repository.IProductRepository;

@Service("productService")
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductRepository repository;
	
	@Override
	public String insertProduct(Product product) {
		Product pro=repository.save(product);
		return "ID: "+pro.getProductId()+"is inserted Successfully";
	}

	@Override
	public Iterable<Product> getAllProducts() {
		 return repository.findAll();
	}

	@Override
	public Optional<Product> findProductById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public String deleteProductById(Integer id) {
		repository.deleteById(id);
		return "ID: "+id+" is deleted.";
	}

}
