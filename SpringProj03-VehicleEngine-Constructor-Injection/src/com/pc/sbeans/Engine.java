package com.pc.sbeans;

public class Engine {
	private String engineType;
	
	public Engine(String engineType) {
		this.engineType=engineType;
	}
	public void showEngineType() {
		System.out.println("Engine Type");
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
}
