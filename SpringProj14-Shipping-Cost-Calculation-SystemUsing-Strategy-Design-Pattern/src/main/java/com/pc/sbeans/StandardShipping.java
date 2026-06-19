package com.pc.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("standard")
@Primary
public class StandardShipping implements ShippingCostStrategy {
	public static final double WIEIGHTCHARGES=5;
	public static final double DISTANCECHARGES=0.5;
	
	@Override
	public double calculateShippingCost(double weight, double distance) {
		System.out.println("StandardShipping.calculateShippingCost()::Primary");
		return (weight*WIEIGHTCHARGES)+(distance*DISTANCECHARGES);
	}

}
