package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.EmployeeResume;

public interface IEmployeeRepository extends JpaRepository<EmployeeResume, Long> {

}
