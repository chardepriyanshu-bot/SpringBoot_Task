package com.pc.sbeans;
import org.springframework.stereotype.Component;

@Component("push")
public class PushNotification implements INotification{

	@Override
	public String sendNotification(String message) {
 		return "Push Notfication sent "+message;
	}

}