package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("petrolEngine")
	Engine engine;
	
	public void startVehicle() {
		 engine.start();
	}
}
