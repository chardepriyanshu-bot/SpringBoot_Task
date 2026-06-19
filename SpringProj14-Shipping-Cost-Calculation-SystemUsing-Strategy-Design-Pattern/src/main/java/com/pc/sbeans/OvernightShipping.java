package com.pc.sbeans;

import org.springframework.stereotype.Component;

@Component("overnight")
public class OvernightShipping implements ShippingCostStrategy {
	public static final double WIEIGHTCHARGES=20;
	public static final double DISTANCECHARGES=2;
	
	@Override
	public double calculateShippingCost(double weight, double distance) {
		return (weight*WIEIGHTCHARGES)+(distance*DISTANCECHARGES);
	}

}