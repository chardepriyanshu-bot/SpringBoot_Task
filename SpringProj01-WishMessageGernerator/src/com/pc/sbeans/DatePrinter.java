package com.pc.sbeans;

import java.time.LocalTime;

public class DatePrinter {
	private LocalTime time;
	
	public void setTime(LocalTime time) {
		this.time=time;
	}
	
	public String generateMessage() {
		int hour=time.getHour();
		if(hour<12) return "Good Morning";
		else if(hour<16) return "Good Afternoon";
		else if(hour<22) return "Good Evening";
		else return "Good Night";
	}
	
}
