package com.pc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.pc.service.CService;

@SpringBootApplication
@EnableScheduling
public class Boot02LibraryBookManagementSystem1Application {


	public static void main(String[] args) {
		SpringApplication.run(Boot02LibraryBookManagementSystem1Application.class, args);	
	}
}
