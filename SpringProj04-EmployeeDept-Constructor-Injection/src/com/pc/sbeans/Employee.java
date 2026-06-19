package com.pc.sbeans;

public class Employee {
	private int empId;
	private String empName;
	private Department dept;
	public Employee(int empId, String empName, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public String showEmployeeInfo() {
		return "EmpId=" + empId + "\nEmpName=" + empName
				+"\n"+dept.getDepartmentDetails();
	}
	
}
