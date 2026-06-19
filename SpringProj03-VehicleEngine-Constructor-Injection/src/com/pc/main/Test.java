package com.pc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pc.sbeans.Car;

public class Test {

	public static void main(String[] args) {
		 FileSystemXmlApplicationContext fs = new FileSystemXmlApplicationContext("src/com/pc/cfgs/applicationContext.xml");
		 Object obj=fs.getBean("car");
		 Car car=(Car) obj;
		 car.displayCarDetails();
	}

}
