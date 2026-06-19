package com.pc.sbeans;

public class Doctor {
	private String specialization;

	public Doctor(String specialization) {
		super();
		this.specialization = specialization;
	}

	public String showDoctor() {
		return "Specialization:" + specialization;
	}
	
}
