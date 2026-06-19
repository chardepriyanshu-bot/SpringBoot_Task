package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.factory.NotificationFactory;

public class Test {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("com/pc/config")){
			 
			 NotificationFactory nf=ctx.getBean(NotificationFactory.class);
			 System.out.println( nf.getNotification("sms"));
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
