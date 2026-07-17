package com.pc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pc.entity.EmployeeResume;
import com.pc.repository.IEmployeeRepository;

@Service
public class EmployeeResumeServiceImpl implements IEmployeeService {

	private final IEmployeeRepository repo;
	
	public EmployeeResumeServiceImpl(IEmployeeRepository repo) {
		this.repo=repo;
	}
	
	@Override
	public EmployeeResume saveEmployeeResume(EmployeeResume empResume) {
		EmployeeResume emp=repo.save(empResume);
		return emp;
	}

	@Override
	public List<EmployeeResume> viewAllEmployeeResume() {
		return repo.findAll();
	}

	@Override
	public EmployeeResume viewEmployeeById(long empId) {
		return repo.findById(empId).orElseThrow(()->new IllegalArgumentException("Invalid Input"));
	}

	@Override
	public String deleteEmployeeResume(long empId) {
		repo.deleteById(empId);
		return "Deleted Successfully";
	}

}
