package com.pc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pc.sbeans.DatePrinter;

public class Test {
	public static void main(String[] args) {
		try(FileSystemXmlApplicationContext file=new FileSystemXmlApplicationContext("src/com/pc/config/applicationContext.xml")){
			DatePrinter dp=(DatePrinter)file.getBean("dt");
			dp.print();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
