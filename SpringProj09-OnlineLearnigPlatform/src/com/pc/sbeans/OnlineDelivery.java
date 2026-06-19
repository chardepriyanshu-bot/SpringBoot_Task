package com.pc.sbeans;
import org.springframework.stereotype.Component;

@Component("online")
public class OnlineDelivery implements DeliveryMode {

	@Override
	public String deliver(String courseName) {
		 return courseName+ " deliver Live Online";
	}

}
