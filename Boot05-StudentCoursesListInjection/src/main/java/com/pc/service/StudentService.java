package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.model.CourseInfo;

@Service("service")
public class StudentService {
	@Autowired
	private CourseInfo course;
	
	public void view() {
		System.out.println(course.toString());
	}
}
