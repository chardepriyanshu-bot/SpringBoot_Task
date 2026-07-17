package com.pc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.entity.Course;
import com.pc.entity.University;
import com.pc.repository.ICourseRepository;
import com.pc.repository.IUniversityRepository;

@Component
public class RunnerTest implements CommandLineRunner {
	private final ICourseRepository crepo;
	private final IUniversityRepository urepo;
	
	
	public RunnerTest(@Autowired ICourseRepository crepo, @Autowired IUniversityRepository urepo) {
		this.crepo=crepo;
		this.urepo=urepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(
		        "Java Full Stack",
		        "6 Months",
		        50000.0
		);

		Course c2 = new Course(
		        "Spring Boot",
		        "4 Months",
		        40000.0
		);


		University u = new University(
		        "GH Raisoni University",
		        "Nagpur",
		        List.of(c1, c2)
		);


		urepo.save(u);
	}
}
