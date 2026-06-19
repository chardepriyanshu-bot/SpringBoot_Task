package com.pc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pc.sbeans.Doctor;
import com.pc.sbeans.Equipment;
import com.pc.sbeans.Hospital;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean
	public Hospital createHospital() {
		return new Hospital("SMDDH",createDoctor(), createEquipment());
	}
	@Bean
	public Doctor createDoctor() {
		return new Doctor("MBBS");
	}
	@Bean
	public Equipment createEquipment() {
		return new Equipment("Laser",200);
	}
	
}