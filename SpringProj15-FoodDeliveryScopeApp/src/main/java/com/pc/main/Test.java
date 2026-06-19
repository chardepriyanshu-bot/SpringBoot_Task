package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.entity.Customer;


public class Test {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			Customer c1=ctx.getBean(Customer.class);
			Customer c2=ctx.getBean(Customer.class);
			c1.setCustomer(101, "rahul");
			c2.setCustomer(102, "pratik");
			
			c1.placeOrder();
			c2.placeOrder();
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
