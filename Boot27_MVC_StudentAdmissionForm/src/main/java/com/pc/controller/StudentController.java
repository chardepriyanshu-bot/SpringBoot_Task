package com.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.entity.Student;

@Controller
public class StudentController {
	
	@GetMapping("/data")
	public String showForm() {
		return "student";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute("student", student);
		return "details";
	}
}
