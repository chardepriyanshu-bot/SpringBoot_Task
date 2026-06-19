package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.pc.service.PrintService;

@Service
public class Runner implements CommandLineRunner {
	
	@Autowired
	private PrintService ser;
	@Override
	public void run(String... args) throws Exception {
		ser.print();
	}

}
