package com.pc.Exam301_VehicleManufacturingSystemUsingFactoryBean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.service.CarService;
import com.pc.service.IVehicleService;

public class Main {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class)){
			
			IVehicleService vehcile=ctxt.getBean("vehicleTypeObject",IVehicleService.class);
			vehcile.vehcileInfo();
			System.out.println();
			vehcile.calculateTax();
			 
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
