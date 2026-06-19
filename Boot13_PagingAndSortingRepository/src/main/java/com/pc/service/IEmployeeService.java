package com.pc.service;

import org.springframework.data.domain.Page;

import com.pc.entity.Employee;

public interface IEmployeeService {
	public Page<Employee> getAllEmployeesPages(int pageNo, int pageSize);
	public Iterable<Employee> getEmployeesSortedBySalary();
	public Iterable<Employee> getEmployeesSortedByName();
}
