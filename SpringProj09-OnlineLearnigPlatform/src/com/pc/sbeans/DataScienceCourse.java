package com.pc.sbeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dataScience")
public class DataScienceCourse implements Course {

	@Autowired
	@Qualifier("classroom")
	private ClassroomDelivery classroomDelivery;
	
	@Override
	public String getCourseName() {
		return "Data Science with Machine Learning";
	}
	public String getMode() {
		return classroomDelivery.deliver(getCourseName());
	}
}
