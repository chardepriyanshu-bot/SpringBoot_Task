package com.pc.repository;

import org.springframework.data.repository.CrudRepository;

import com.pc.entity.Student;

public interface IStudentRepository extends CrudRepository<Student, Integer> {

}
