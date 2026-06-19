package com.pc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pc.service.IDoctorService;

@Controller
public class DoctorController {

	@Autowired
	private IDoctorService service;
	
	public void findByDoctorNameLike(String pattern){
		service.getByDoctorNameLike(pattern).forEach(System.out::println);
	}
	public void findBySpecializationIn(List<String> specializations){
		service.getBySpecializationIn(specializations).forEach(System.out::println);
	}
	public void findByDoctorNameStartingWith(String prefix) {
		service.getByDoctorNameStartingWith(prefix).forEach(System.out::println);
	}
	public void findByDoctorNameEndingWith(String suffix) {
		service.getByDoctorNameEndingWith(suffix).forEach(System.out::println);
	}
	public void findByCityIn(List<String> cities) {
		service.getByCityIn(cities).forEach(System.out::println);
	}
	public void findByHospitalNameLike(String pattern) {
		service.getByHospitalNameLike(pattern).forEach(System.out::println);
	}
	public void findByEmailEndingWith(String domain) {
		service.getByEmailEndingWith(domain).forEach(System.out::println);
	}
	public void findBySpecializationStartingWith(String prefix) {
		service.getBySpecializationStartingWith(prefix).forEach(System.out::println);
	}
	
}
