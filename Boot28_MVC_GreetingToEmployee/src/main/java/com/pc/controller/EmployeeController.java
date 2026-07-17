package com.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/")
	public String show() {
		System.out.println("EmployeeController.show()");
		return "greeting";
	}
}
