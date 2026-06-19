package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.pc.entity.Employee;
import com.pc.repository.ICustomRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private ICustomRepository repo;
	
	@Override
	public Page<Employee> getAllEmployeesPages(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Employee> page=repo.findAll(pageable);
		return page;
	}

	@Override
	public Iterable<Employee> getEmployeesSortedBySalary() {
		Sort sort=Sort.by(Direction.ASC,"salary");
		Iterable<Employee> iterable=repo.findAll(sort);
		return iterable;
	}

	@Override
	public Iterable<Employee> getEmployeesSortedByName() {
		Sort sort=Sort.by(Direction.ASC,"employeeName");
		Iterable<Employee> iterable=repo.findAll(sort);
		return iterable;
	}

}
