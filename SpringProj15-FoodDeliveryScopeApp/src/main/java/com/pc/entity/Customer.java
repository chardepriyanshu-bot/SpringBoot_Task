package com.pc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pc.service.DeliveryService;

@Component("customer")
@Scope("prototype")
public class Customer {
	private int custId;
	private String custName;
	@Autowired
	private DeliveryService deliveryService;
	
	public void setCustomer(int custId, String custName) {
		this.custId=custId;
		this.custName=custName;
	}
	
	public void placeOrder() {
		System.out.println(custName+" placed an order");
		deliveryService.deliverOrder();
	}
	 
}
