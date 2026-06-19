package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.Config.AppConfig;
import com.pc.sbeans.GroceryStore;

public class Test {
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			
			GroceryStore g=ctx.getBean(GroceryStore.class);
			
			System.out.println(g.showStoreDetails());
			System.out.println("\nCalculate Discount: "+g.calculateDiscount(3000));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
