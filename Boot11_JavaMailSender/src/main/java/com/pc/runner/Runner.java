package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.controller.EmployeeController;
import com.pc.entity.Employee;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private EmployeeController ctrl;
	@Override
	public void run(String... args) throws Exception {
		ctrl.sendMail(new Employee("piyush","chardepriyanshu@gmail.com"));
	}

}
