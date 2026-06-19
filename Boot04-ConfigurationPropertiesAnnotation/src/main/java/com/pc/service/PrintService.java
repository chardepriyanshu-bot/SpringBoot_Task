package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pc.model.StudentInfo;

@Component
public class PrintService {

	@Autowired
	private StudentInfo student;
	
	public void print() {
		System.out.println(student);
	}
}
