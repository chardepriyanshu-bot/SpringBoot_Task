package com.pc.factory;

import java.util.Map;

import javax.management.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("factory")
public class NotificationFactory {
	@Autowired
	private Map<String, Notification> notification;
	
	public Notification getNotification(String type) {
		 if(notification.get(type)!=null) {
			 return notification.get(type);
		 }else {
			 throw new IllegalArgumentException("Invalid Notification Type");
		 }
	}
}
