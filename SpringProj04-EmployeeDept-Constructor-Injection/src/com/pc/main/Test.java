package com.pc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pc.sbeans.Employee;

public class Test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext file = new FileSystemXmlApplicationContext("src/com/pc/cfgs/applicationContext.xml");
		Object obj= file.getBean("emp");
		Employee emp=(Employee) obj;
		System.out.println(emp.showEmployeeInfo());
	}

}
