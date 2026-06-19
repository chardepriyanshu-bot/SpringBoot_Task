package com.pc.SpringProj14_Shipping_Cost_Calculation_SystemUsing_Strategy_Design_Pattern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.ApplicationConfig;
import com.pc.sbeans.ShippingCostContext;

public class Test {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class)){
			
			ShippingCostContext shipping = ctx.getBean(ShippingCostContext.class);
			shipping.calculateCost(200, 3647);
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
