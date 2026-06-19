package com.pc.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("delivery")
@Scope("singleton")
public class DeliveryService {
	private String serviceName="Express Delivery";
	private int totalOrder;
	 
	public void deliverOrder( ) {
		  totalOrder++;
		  System.out.println("Order Delivered");
	}
	public String showServiceInfo() {
		System.out.println();
		return "Name: "+serviceName+
		"\nTotal Order: "+totalOrder;
	}
}
