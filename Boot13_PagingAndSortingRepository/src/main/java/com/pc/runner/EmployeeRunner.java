package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.pc.entity.Employee;
import com.pc.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmployeeRunner.run()");
		try {
			
			 Page<Employee> page = service.getAllEmployeesPages(0, 6);

			 System.out.println("Total Elements : " + page.getTotalElements());
			 System.out.println("Total Pages : " + page.getTotalPages());
			 System.out.println("Content Size : " + page.getContent().size());

			 page.getContent().forEach(System.out::println);
			 
			 
			/*
			Iterable<Employee> iterable=service.getEmployeesSortedByName();
			iterable.forEach(System.out::println);
			
			Iterable<Employee> itr2=service.getEmployeesSortedBySalary();
			itr2.forEach(System.out::println);
			 */
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
