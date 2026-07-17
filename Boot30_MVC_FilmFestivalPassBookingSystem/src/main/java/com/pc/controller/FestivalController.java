package com.pc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.model.FestivalPass;

@Controller
public class FestivalController {

	@GetMapping("/festival")
	public String getFestivalPass(@ModelAttribute("festival") FestivalPass festival) {
		System.out.println("FestivalController.getFestivalPass()");
		return "festivalForm";
	}

	@PostMapping("/festival")
	public String showFestival(@ModelAttribute("festival") FestivalPass festival) {
		System.out.println("FestivalController.showFestival()");
		System.out.println(festival);
		return "festivalSuccess";
	}
}