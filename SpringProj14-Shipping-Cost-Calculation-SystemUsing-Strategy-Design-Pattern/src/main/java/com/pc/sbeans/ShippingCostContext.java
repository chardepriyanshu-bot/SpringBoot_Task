package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("context")
public class ShippingCostContext {
	private ShippingCostStrategy shippingCostStrategy;
	
	@Autowired
	public ShippingCostContext(@Qualifier("overnight")ShippingCostStrategy shippingCostStrategy) {
		this.shippingCostStrategy=shippingCostStrategy;
	}
	
	public void calculateCost(double weight, double distance) {
		System.out.println("ShippingCostContext.calculateCost():: Overnight");
		System.out.println(shippingCostStrategy.calculateShippingCost(weight, distance));
	}
}