package com.pc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pc.entity.Product;
import com.pc.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService service;
	
	public void insertProduct(Product product) {
		System.out.println(service.insertProduct(product));
	}
	public void retrieveAllProducts() {
		Iterable<Product> iterable=service.getAllProducts();
		for(Product product:iterable) System.out.println(product);
	}
	public void findProductById(Integer id) {
		Optional<Product> product=service.findProductById(id);
		if(product!=null) System.out.println(product); 
		else System.err.println("Invalid Id.");
	}
	public void deleteProductById(Integer id) {
		System.out.println(service.deleteProductById(id));
	}
}