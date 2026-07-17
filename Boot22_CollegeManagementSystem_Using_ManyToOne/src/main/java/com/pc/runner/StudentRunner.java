package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.entity.College;
import com.pc.entity.Student;
import com.pc.repository.IRepositoryCollege;
import com.pc.repository.IRepositoryStudent;

@Component
public class StudentRunner implements CommandLineRunner {
	private final IRepositoryCollege clgRepo;
	private final IRepositoryStudent studentRepo;
	

	public StudentRunner(@Autowired IRepositoryCollege clgRepo, @Autowired IRepositoryStudent studentRepo) {
		this.clgRepo = clgRepo;
		this.studentRepo = studentRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Student student=new Student("Smith", "IT",92.0,new College("GHRCE","Nagpur"));
		studentRepo.save(student);
		Student student2=new Student("Harry", "ECE",90.0,new College("VNIT","Nagpur"));
		studentRepo.save(student2);
		Student student3=new Student("David", "ME",94.0,new College("RTMNU","Nagpur"));
		studentRepo.save(student3);
	}

}
