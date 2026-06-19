package com.pc.sbeans;

import org.springframework.stereotype.Component;

@Component("express")
public class ExpressShipping implements ShippingCostStrategy {
	public static final double WIEIGHTCHARGES=10;
	public static final double DISTANCECHARGES=1;
	
	@Override
	public double calculateShippingCost(double weight, double distance) {
		return (weight*WIEIGHTCHARGES)+(distance*DISTANCECHARGES);
	}

}