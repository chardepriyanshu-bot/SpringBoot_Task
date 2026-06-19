package com.pc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pc.sbeans.DatePrinter;

public class DependencyManagementTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctxt = new FileSystemXmlApplicationContext("src/com/pc/cfgs/applicationContext.xml");
		Object obj=ctxt.getBean("dp");
		DatePrinter d=(DatePrinter)obj;
		String msg=d.generateMessage();
		System.out.println(msg);
	}

}
