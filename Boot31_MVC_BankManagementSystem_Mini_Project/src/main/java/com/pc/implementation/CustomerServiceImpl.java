package com.pc.implementation;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pc.entity.Customer;
import com.pc.repository.ICustomerRepository;
import com.pc.service.ICustomerService;
import com.pc.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	private final ICustomerRepository customerRepository;
	
	public CustomerServiceImpl(ICustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	
	@Override
	@Transactional
	public Customer registerCustomer(CustomerVO customerVO) {
	    System.out.println(customerVO);
	    Customer customer = new Customer();
	    BeanUtils.copyProperties(customerVO, customer);
	    System.out.println(customer);
	    Customer cust = customerRepository.save(customer);
	    System.out.println("Saved ID : " + cust.getCustomerId());
	    return cust;
	}
	
	@Override
	@Transactional
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}

}
