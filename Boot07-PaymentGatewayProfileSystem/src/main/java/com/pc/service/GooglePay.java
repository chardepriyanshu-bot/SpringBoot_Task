package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pc.entity.Company;

@Service
@Profile("google")
public class GooglePay implements IPaymentService {
	
	@Autowired
	private Company company;
	
	@Override
	public void makePayment() {
		 System.out.println("Payment Successfully.");
	}

	@Override
	public void showPaymentDetails() {
		System.out.println(company.toString());
	}
}
