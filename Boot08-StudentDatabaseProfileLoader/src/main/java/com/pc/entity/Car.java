package com.pc.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Car {
	@Value("${carName}")
	private String carName;
	@Value("${enginePower}")
	private int enginePower;
	@Value("${mileage}")
	private double mileage;
}
