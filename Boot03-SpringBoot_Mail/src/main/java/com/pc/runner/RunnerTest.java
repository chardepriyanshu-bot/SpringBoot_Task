package com.pc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.service.IPurchaseOrder;

@Component
public class RunnerTest implements CommandLineRunner {

	@Autowired
	private IPurchaseOrder order;
	
	@Override
	public void run(String... args) throws Exception {
            try{
			String msg=order.purchase(new String[] {"shirt","trouser"},new double[] {5000,6000}, new String[] {"chardepriyanshu@gmail.com",
					"priyanshu.charde.ex@ghrce.raisoni.net"});
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
