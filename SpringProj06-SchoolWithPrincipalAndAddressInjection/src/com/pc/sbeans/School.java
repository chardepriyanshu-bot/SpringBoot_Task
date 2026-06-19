package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
	@Autowired
	private Principle principle;
	@Autowired
	private Address address;
	private String schoolName;
	public void setSchoolName(String schoolName) {
		this.schoolName=schoolName;
	}
	public String showDetails() {
		return "SchoolName: "+schoolName+"\n"+principle.toString()+"\n"+address.toString();
	}
}
