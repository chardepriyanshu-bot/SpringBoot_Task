package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.Customer;
import com.pc.repository.IRepository;

@Service("customerService")
public class ICustomerServiceImp implements ICustomerService {
	
	@Autowired
	private IRepository repository;
	
	@Override
	public String customerInfo(Customer cust) {
		Customer c=repository.save(cust);
		return "Customer is saved with Id= "+c.getCustId();
	}

}
