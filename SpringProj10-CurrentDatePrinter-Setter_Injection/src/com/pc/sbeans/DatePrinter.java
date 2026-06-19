package com.pc.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class DatePrinter {
	private LocalDate date;
	private LocalTime time;
	
	public void setDate(LocalDate date) {
		this.date=date;
	}
	public void setTime(LocalTime time) {
		this.time=time;
	}
	public void print() {
		System.out.println("Local Date: "+date);
		System.out.println("Local Time: "+time);
		
	}
}
