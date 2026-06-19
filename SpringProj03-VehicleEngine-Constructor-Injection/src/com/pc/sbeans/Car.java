package com.pc.sbeans;

public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void displayCarDetails() {
		 System.out.println("Car is running with "+engine.getEngineType()+" engine");
	}

}
