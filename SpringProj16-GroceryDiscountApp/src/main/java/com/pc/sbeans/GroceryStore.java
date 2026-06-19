package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GroceryStore {

	@Value("101")
	private int storeId;
	@Value("TuntunMosi Ladu shop")
	private String storeName;
	@Value("Dholakpur")
	private String location;
	@Value("20")
	private int discountPercentage;
	@Value("true")
	private boolean homeDeliveryAvailable;

	public String showStoreDetails() {
		return "\n----- GroceryStore ---- \nStoreId=" + storeId + "\nstoreName=" + storeName + "\nLocation=" + location
				+ "\nDiscountPercentage=" + discountPercentage + "\nHomeDeliveryAvailable=" + homeDeliveryAvailable
				;
	}
	
	public double calculateDiscount(double amount) {
		return amount-((discountPercentage/100.0)*amount);
	}
}
