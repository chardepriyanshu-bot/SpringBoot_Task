package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourse implements Course {
	
	@Autowired
	@Qualifier("online")
	private OnlineDelivery onlineDelivery;
	
	@Override
	public String getCourseName() {
		return "Java Programming";
	}

	public String getMode() {
		return onlineDelivery.deliver(getCourseName());
	}
}
