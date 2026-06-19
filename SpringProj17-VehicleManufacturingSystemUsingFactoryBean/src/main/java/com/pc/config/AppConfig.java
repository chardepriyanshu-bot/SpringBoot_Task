package com.pc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pc.factorybean.VehilcleBeanFactory;

@Configuration
@ComponentScan(basePackages="com.pc.service")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig::AppConfig()");
	}
	
	@Bean
	public VehilcleBeanFactory vehicleTypeObject() {
		VehilcleBeanFactory factory=new VehilcleBeanFactory();
		factory.setVehicleType("car");
		return factory;
	}
}
