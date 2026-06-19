package com.pc.sbeans;

import java.time.LocalDate;

public class DataService {
	private LocalDate date;
	
	public void setDate(LocalDate date) {
		this.date=date;
	}
	public String getDayOfWeek() { 
		return date.getDayOfWeek().toString();
	}
	public String WeekendOrNot() {
		if(getDayOfWeek().equalsIgnoreCase("Sunday") ||getDayOfWeek().equalsIgnoreCase("Saturday") ) {
			return "It is Weekend";
		}
		else {
			return "It is WeekDay";
		}
	}
}
