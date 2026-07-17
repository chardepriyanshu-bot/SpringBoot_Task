package com.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.entity.Student;


@Controller
public class StudentController {
	
	@GetMapping("/")
	public String showForm() {
		return "studentForm";
	}
	
	@PostMapping("/register")
	public String process(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute("student",student);
		return "details";
	}
}
