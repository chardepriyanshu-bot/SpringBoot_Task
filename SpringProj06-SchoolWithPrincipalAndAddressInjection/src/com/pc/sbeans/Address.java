package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	private String city;
	private String state;

	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "City: "+city+"\nState: "+state;
	}
}
