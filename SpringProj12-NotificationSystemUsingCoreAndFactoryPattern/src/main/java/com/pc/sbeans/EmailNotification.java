package com.pc.sbeans;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements INotification{

	@Override
	public String sendNotification(String message) {
		return "Email sent "+message;
	}

}
