package com.pc.runnner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.controller.ProductController;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private ProductController controller;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		/*
		 * ---------------- product Insert ------------------------
		Product p=new Product();
		System.out.println("Enter product name:");
		p.setProductName(sc.nextLine());
		System.out.println("Enter description:");
		p.setDescription(sc.nextLine());
		System.out.println("Enter price:");
		p.setPrice(Double.parseDouble(sc.nextLine()));
		controller.insertProduct(p);
		*/
		/*
		 * ----------- product retrieve all -------------
		 controller.retrieveAllProducts();
		 */
		
		/*
		 ----------- product get by Id -------------
		 System.out.println("Enter Id:");
		controller.findProductById(sc.nextInt());
		 */
		
		 System.out.println("Enter Id:");
	     controller.deleteProductById(sc.nextInt());
		
		
		sc.close();
	}

}
