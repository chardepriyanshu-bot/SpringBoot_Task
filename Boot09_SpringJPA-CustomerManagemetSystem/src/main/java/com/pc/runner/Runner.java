package com.pc.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.entity.Customer;
import com.pc.service.ICustomerService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private ICustomerService service;
	@Override
	public void run(String... args) throws Exception {
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		c.setCname(sc.nextLine());
		System.out.println("Enter Phno:");
		c.setPhno(sc.nextLine());
		System.out.println("Enter Address:");
		c.setAddress(sc.nextLine());
		System.out.println("Enter total bill:");
		c.setBill(Double.parseDouble(sc.nextLine()));
		System.out.println(service.customerInfo(c));;
		sc.close();
	}

}
