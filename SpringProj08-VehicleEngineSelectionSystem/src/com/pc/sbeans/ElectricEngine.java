package com.pc.sbeans;

import org.springframework.stereotype.Component;

@Component("electricEngine")
public class ElectricEngine implements Engine {

	@Override
	public void start() {
		 System.out.println("Electric Engine");
	}

}
