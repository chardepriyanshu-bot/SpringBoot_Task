package com.pc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.Student;
import com.pc.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentRepository repository;
	
	@Override
	public String registerStudent(Student student) {
		Student s=repository.save(student);
		return "Student is registered Successfully with Id: "+s.getStudentId();
	}

	@Override
	public Iterable<Student> getAllStudents() {
		Iterable<Student> iterable=repository.findAll();
		return iterable;
	}

	@Override
	public Optional<Student> getStudentById(Integer studentId) {
		Optional<Student> optStudent=repository.findById(studentId);
		return optStudent;
	}

	@Override
	public String updateCourse(Student student) {
		repository.save(student);
		return "Student is updated successfully.";
	}

	@Override
	public String deleteStudent(Integer studentId) {
		repository.deleteById(studentId);;
		return "Student is deleted successfully.";
	}

	@Override
	public Long countStudents() {
		return repository.count();
	}

}
