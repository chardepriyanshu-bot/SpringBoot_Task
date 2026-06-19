package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("principle")
public class Principle {
	
	private String name;
	private int experience;
	public void setName(String name) {
		this.name = name;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Name: "+name+"\nExperience: "+experience;
	}
}

