package com.pc.sbeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("python")
public class PythonCourse implements Course {
	@Autowired
	@Qualifier("record")
	private RecordDelivery recordDelivery;
	
	@Override
	public String getCourseName() {
		return "Python for Beginners";
	}
	public String getMode() {
		return recordDelivery.deliver(getCourseName());
	}
}
