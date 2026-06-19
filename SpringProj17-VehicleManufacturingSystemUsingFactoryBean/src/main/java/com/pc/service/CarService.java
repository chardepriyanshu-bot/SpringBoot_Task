package com.pc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class CarService implements IVehicleService{

	private String vehcileNo;
	private String brandName;
	private String vehcileType;
	private String fuelType;
	private double mileage;
	private double price;
	
	public CarService(String vehcileNo, String brandName, String vehcileType, String fuelType, double mileage,
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
	   System.out.println("Car road tax is "+(price*0.12));
	}
	
	@Override
	public void vehcileInfo() {
		System.out.println("Vehcile No: "+vehcileNo+"\nBrandName: "+brandName+"\nVehicleType: "+vehcileType
				+"\nFuelType"+fuelType+"\nMileage"+mileage+"\nPrice: "+price);
	}


}
