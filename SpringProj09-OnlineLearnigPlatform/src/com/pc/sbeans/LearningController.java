package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("controller")
public class LearningController {
	@Autowired
	private JavaCourse java;
	@Autowired
	private PythonCourse python;
	@Autowired
	private DataScienceCourse data;
	
	public void enrollJavaCourse() {
		System.out.println("Enrolled in "+java.getCourseName());
		System.out.println("DeliveryMode via "+ java.getMode());
	}

	public void enrollPythonCourse() {
		System.out.println("Enrolled in "+python.getCourseName());
		System.out.println("DeliveryMode via "+ python.getMode());
	}

	public void enrollDataScienceCourse() {
		System.out.println("Enrolled in "+data.getCourseName());
		System.out.println("DeliveryMode via "+data.getMode() );
	}
}
