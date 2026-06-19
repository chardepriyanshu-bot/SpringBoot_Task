package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.service.StudentService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private StudentService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.view();
	}

}
