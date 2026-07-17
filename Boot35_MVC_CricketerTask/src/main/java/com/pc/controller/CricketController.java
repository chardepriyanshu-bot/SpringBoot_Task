package com.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.entity.Cricketer;
import com.pc.service.ICricketService;

@Controller
public class CricketController {
	private final ICricketService service;
	
	public CricketController(ICricketService service) {
		this.service=service;
	}
	
	@GetMapping("/register")
	public String showForm() {
		System.out.println("CricketController.showForm()");
		return "show_form";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("cricketer") Cricketer cricketer ,Model model) {
		System.out.println("CricketController.register()");
		service.saveCricketer(cricketer);
		model.addAttribute("cricketerList",service.getAllCricketers());
		return "show_cricketer";
	}
	@GetMapping("/update")
	public String update_form() {
		System.out.println("CricketController.update_form()");
		return "update_form";
	}
	@GetMapping("/delete")
	public String delete_form() {
		System.out.println("CricketController.delete_form()");
		return "delete_form";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute("cricketer") Cricketer cricketer ,Model model) {
		System.out.println("CricketController.update()");
		service.updateCricketer(cricketer);
		model.addAttribute("cricketerList",service.getAllCricketers());
		return "show_cricketer";
	}
	@PostMapping("/delete")
	public String delete(@ModelAttribute("playerId") Long playerId ,Model model) {
		System.out.println("CricketController.delete()");
		service.deleteCricketer(playerId);
		model.addAttribute("cricketerList",service.getAllCricketers());
		return "show_cricketer";
	}
}
