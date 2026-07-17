package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Student;

public interface IRepositoryStudent extends JpaRepository<Student, Long> {

}
