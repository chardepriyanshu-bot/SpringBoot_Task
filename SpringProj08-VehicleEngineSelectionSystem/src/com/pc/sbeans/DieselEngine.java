package com.pc.sbeans;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine {

	@Override
	public void start() {
		 System.out.println("Petrol Engine");
	}

}
