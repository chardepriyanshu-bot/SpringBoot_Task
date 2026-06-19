package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pc.entity.Car;

@Service
@Profile("petrol")
public class PetrolEngine implements IEngine {
	
	@Autowired
	private Car car;

	@Override
	public void startEngine() {
		 System.out.println("Engine starts");
	}

	@Override
	public void showEngineDetails() {
		 System.out.println(car.toString());
	}

}
