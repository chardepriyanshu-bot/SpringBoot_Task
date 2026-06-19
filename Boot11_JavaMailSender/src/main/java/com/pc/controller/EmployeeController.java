package com.pc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pc.entity.Employee;
import com.pc.service.EmployeeService;

import jakarta.mail.MessagingException;

@Component
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	public void sendMail(Employee emp) throws MessagingException {
		System.out.println(service.sendMail(emp));
	}
}
