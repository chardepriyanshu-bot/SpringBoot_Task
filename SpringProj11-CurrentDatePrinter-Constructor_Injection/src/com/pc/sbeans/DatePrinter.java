package com.pc.sbeans;

import java.time.LocalDate;

public class DatePrinter {
	private LocalDate date;
	
	public DatePrinter(LocalDate date) {
		this.date=date;
	}
	
	public void print() {
		System.out.println("LocalDate: "+date);
	}
}
