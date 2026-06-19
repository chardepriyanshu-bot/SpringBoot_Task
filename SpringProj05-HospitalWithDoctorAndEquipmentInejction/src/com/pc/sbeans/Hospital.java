package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Hospital {
	private String hospitalName;
	private Doctor doctor;
	private Equipment equipment;
	
 
	public Hospital(String hospitalName, Doctor doctor, Equipment equipment) {
		this.hospitalName = hospitalName;
		this.doctor = doctor;
		this.equipment = equipment;
	}
	
	public String showDetails() {
		return "Hospital Name: "+hospitalName+"\n"+doctor.showDoctor()+"\n"+equipment;
	}
	
}
