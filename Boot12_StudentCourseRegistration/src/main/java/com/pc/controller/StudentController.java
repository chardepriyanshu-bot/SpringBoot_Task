package com.pc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pc.entity.Student;
import com.pc.service.IStudentService;

@Controller
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	public void registerStudent(Student student) {
		System.out.println(service.registerStudent(student));
	}
	public void viewAllStudents() {
		Iterable<Student> iterable=service.getAllStudents();
		iterable.forEach(System.out::println);
	}
	public void searchById(Integer studentId) {
		System.out.println(service.getStudentById(studentId));
	}
	
	public void updateCourse(Student student) {
		System.out.println(service.updateCourse(student));
	}
	
	public void deleteStudent(Integer studentId) {
		System.out.println(service.deleteStudent(studentId));
	}
	
	public void countStudent() {
		System.out.println("Total Student is: "+service.countStudents());
	}
}
