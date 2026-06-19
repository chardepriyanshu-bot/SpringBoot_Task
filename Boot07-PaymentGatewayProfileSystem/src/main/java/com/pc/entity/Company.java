package com.pc.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Company {
	
	 @Value("${company.companyName}")
	 private String companyName;
	 @Value("${company.transactionLimit}")
	 private double transactionLimit;
	 @Value("${company.paymentType}")
	 private String paymentType;
}
