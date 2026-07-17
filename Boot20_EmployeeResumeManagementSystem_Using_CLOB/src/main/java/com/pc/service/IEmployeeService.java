package com.pc.service;

import java.util.List;
import com.pc.entity.EmployeeResume;

public interface IEmployeeService {
	public EmployeeResume saveEmployeeResume(EmployeeResume empResume);
	public List<EmployeeResume> viewAllEmployeeResume();
	public EmployeeResume viewEmployeeById(long empId);
	public String deleteEmployeeResume(long empId);
}
