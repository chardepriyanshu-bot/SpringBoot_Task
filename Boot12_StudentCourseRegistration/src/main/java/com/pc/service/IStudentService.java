package com.pc.service;

import java.util.Optional;

import com.pc.entity.Student;

public interface IStudentService {
	public String registerStudent(Student student);
	public Iterable<Student> getAllStudents();
	public Optional<Student> getStudentById(Integer studentId);
	public String updateCourse(Student student); 
	public String deleteStudent(Integer studentId);
	public Long countStudents();
}
