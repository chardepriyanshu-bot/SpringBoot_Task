package com.pc.service;

import org.springframework.stereotype.Component;

public class BikeService implements IVehicleService{

	private String vehcileNo;
	private String brandName;
	private String vehcileType;
	private String fuelType;
	private double mileage;
	private double price;
	
	public BikeService(String vehcileNo, String brandName, String vehcileType, String fuelType, double mileage,
			double price) {
		super();
		this.vehcileNo = vehcileNo;
		this.brandName = brandName;
		this.vehcileType = vehcileType;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.price = price;
	}

	
	@Override
	public void calculateTax() {
		//System.out.println("BikeService.calculateTax()");
		System.out.println("Bike road tax is "+(price*0.08));
	}
	

	@Override
	public void vehcileInfo() {
		System.out.println("Vehcile No: "+vehcileNo+"\nBrandName: "+brandName+"\nVehicleType: "+vehcileType
				+"\nFuelType"+fuelType+"\nMileage"+mileage+"\nPrice: "+price);
	}

}
