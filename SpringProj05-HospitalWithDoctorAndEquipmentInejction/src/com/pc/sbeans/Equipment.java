package com.pc.sbeans;

public class Equipment {
	private String equipmentName;
	private double cost;
	public Equipment(String equipmentName, double cost) {
		super();
		this.equipmentName = equipmentName;
		this.cost = cost;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String toString() {
		return "EquipmentName: " + equipmentName + "\ncost:" + cost ;
	}
	
	
}
