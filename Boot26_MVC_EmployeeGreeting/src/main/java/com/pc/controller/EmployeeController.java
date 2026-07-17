package com.pc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public String process(Model model) {
		model.addAttribute("empId", 1);
		model.addAttribute("empName", "Smith");
		model.addAttribute("dept", "IT");
		model.addAttribute("salary",56000);
		return "display";
	}
}
