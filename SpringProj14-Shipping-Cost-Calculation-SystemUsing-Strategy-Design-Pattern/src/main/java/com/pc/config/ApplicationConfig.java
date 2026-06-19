package com.pc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.pc.sbeans")
public class ApplicationConfig {
	public ApplicationConfig() {
		System.out.println("ApplicationConfig::ApplicationConfig()");
	}
}
