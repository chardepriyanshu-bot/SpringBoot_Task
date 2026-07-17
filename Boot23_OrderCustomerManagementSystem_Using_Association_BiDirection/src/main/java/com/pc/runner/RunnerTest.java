package com.pc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.entity.Customer;
import com.pc.entity.Order;
import com.pc.repository.ICustomerRepository;
import com.pc.repository.IOrderRepository;

@Component
public class RunnerTest implements CommandLineRunner {
	private final ICustomerRepository custRepo;
	private final IOrderRepository orderRepo;

	public RunnerTest(@Autowired ICustomerRepository custRepo,@Autowired IOrderRepository orderRepo) {
		this.custRepo = custRepo;
		this.orderRepo = orderRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Customer cust=new Customer("Jade Roy","jade@gmail.com");
		List<Order>order1=List.of(new Order("Mobile Phone", 2, 9999.9, cust),
		new Order("Washing Machine", 3, 12999.9, cust),
		new Order("Refrigator", 1, 34999.9, cust),
		new Order("Laptop", 5, 89999.9, cust));
		cust.setOrders(order1);
		custRepo.save(cust);
		
	}

}
