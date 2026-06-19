package com.pc.sbeans;

public interface ShippingCostStrategy {
	public double calculateShippingCost(double weight, double distance);
}
