package com.pc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.entity.EmployeeResume;
import com.pc.service.IEmployeeService;

@Component
public class EmployeeResumeRunnerTest implements CommandLineRunner{
	private final IEmployeeService service;
	
	public EmployeeResumeRunnerTest(IEmployeeService service) {
		this.service=service;
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		
		 EmployeeResume emp1 = new EmployeeResume(
	             
	                "John",
	                "Java Developer",
	                """
	                Experienced Java Developer with 5 years of experience in Spring Boot,
	                Hibernate, Microservices, REST APIs, MySQL, and cloud deployment.
	                """
	        );

	        EmployeeResume emp2 = new EmployeeResume(
	               
	                "David",
	                "Full Stack Developer",
	                """
	                Skilled Full Stack Developer with expertise in Java, React,
	                Angular, Spring Boot, SQL, and AWS technologies.
	                """
	        );

	        EmployeeResume emp3 = new EmployeeResume(
	      
	                "Sophia",
	                "Software Engineer",
	                """
	                Software Engineer with strong knowledge of Data Structures,
	                Algorithms, Java, Python, and Software Design Principles.
	                """
	        );

	        System.out.println(service.saveEmployeeResume(emp1));
	        System.out.println(service.saveEmployeeResume(emp2));
	        System.out.println(service.saveEmployeeResume(emp3));
	        
	 */   
		
		System.out.println(service.viewEmployeeById(53));
		
		 //service.viewAllEmployeeResume().forEach(System.out::println);
		
		//System.out.println(service.deleteEmployeeResume(54));
		
	}
	
}
