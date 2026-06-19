package com.pc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pc.sbeans.DataService;

public class Main {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext file = new FileSystemXmlApplicationContext("src/com/pc/cfgs/applicationContext.xml");
		Object obj=file.getBean("ds");
		DataService dataService=(DataService)obj;
		System.out.println(dataService.WeekendOrNot());
	}
}