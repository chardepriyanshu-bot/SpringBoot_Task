package com.pc.factorybean;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.pc.service.BikeService;
import com.pc.service.CarService;
import com.pc.service.IVehicleService;
import com.pc.service.TruckService;

@Component("factory")
public class VehilcleBeanFactory implements FactoryBean<IVehicleService>{
	
	private String vehicleType;
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType=vehicleType;
	}
	
	@Override
	public @Nullable IVehicleService getObject() throws Exception {
		if("car".equalsIgnoreCase(vehicleType))
			return new CarService("MH40JS3833","BMW","CAR","PETROL",20,1000000.0);
		
		else if("bike".equalsIgnoreCase(vehicleType)) 
			return new BikeService("MH40FH3483","PULSAR","BIKE","PETROL",60,20000.0);
	
		else if("truck".equalsIgnoreCase(vehicleType)) 
			return new TruckService("MH40AL4573","Tata","TRUCK","DISEL",10,400000.0);
		
		else throw new IllegalArgumentException("No such type found");
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		return IVehicleService.class;
	}
	
}
