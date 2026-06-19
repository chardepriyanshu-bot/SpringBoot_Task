package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
	@Autowired
	@Qualifier("paytmPaymentService")
	PaymentService paymentService;
	
	public void processPayment(double amount) {
		System.out.println("Processing..");
		paymentService.pay(amount);
	}
}
