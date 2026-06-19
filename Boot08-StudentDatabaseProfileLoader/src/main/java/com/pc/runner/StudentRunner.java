package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.service.IEngine;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private IEngine engine;
	
	@Override
	public void run(String... args) throws Exception {
		 engine.showEngineDetails();
		 System.out.println();
		 engine.startEngine();
	}

}
