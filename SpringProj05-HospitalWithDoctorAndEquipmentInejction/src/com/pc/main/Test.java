package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.sbeans.Hospital;

public class Test {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class)){
			Hospital hospital=ctxt.getBean("createHospital",Hospital.class);
			System.out.println(hospital.showDetails());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
