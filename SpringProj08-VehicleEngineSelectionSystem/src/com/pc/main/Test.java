package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.sbeans.Vehicle;

public class Test {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class)){
			Vehicle bean = ctxt.getBean(Vehicle.class); 
			bean.startVehicle();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
