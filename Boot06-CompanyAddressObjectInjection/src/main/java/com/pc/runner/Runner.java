package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.service.CompanyService;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private CompanyService service;
	@Override
	public void run(String... args) throws Exception {
		service.details();
	}

}
