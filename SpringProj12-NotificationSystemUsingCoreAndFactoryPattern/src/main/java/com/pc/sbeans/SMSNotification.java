package com.pc.sbeans;
import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements INotification{

	@Override
	public String sendNotification(String message) {
		return "SMS sent "+message;
	}

}