package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.sbeans.PaymentProcessor;

public class PaymentTest {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class)){
			PaymentProcessor pp=ctxt.getBean(PaymentProcessor.class);
			pp.processPayment(1000);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
