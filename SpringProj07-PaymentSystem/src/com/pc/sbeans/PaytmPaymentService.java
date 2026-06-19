package com.pc.sbeans;

import org.springframework.stereotype.Component;

@Component("paytmPaymentService")
public class PaytmPaymentService implements PaymentService{
	public void pay(double amount) {
		System.out.println("Rs. "+amount+" paid using Paytm");
	}
}
