package com.pc.sbeans;
import org.springframework.stereotype.Component;

@Component("record")
public class RecordDelivery implements DeliveryMode {

	@Override
	public String deliver(String courseName) {
		 return courseName+ " deliver Recorded Videos";
	}
	
}
