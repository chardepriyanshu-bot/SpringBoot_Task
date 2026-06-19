package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.pc.entity.Patient;
import com.pc.service.IPatientService;

@Component
public class PatientRunner implements CommandLineRunner {

	@Autowired
	private IPatientService service;
	
	@Override
	public void run(String... args) throws Exception {
		 
		 Page<Patient> page = service.getPatientByPages(0, 6);

		 System.out.println("Total Elements : " + page.getTotalElements());
		 System.out.println("Total Pages : " + page.getTotalPages());
		 System.out.println("Content Size : " + page.getContent().size());

		 page.getContent().forEach(System.out::println);
	}

}
