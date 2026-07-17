package com.pc.service;

import java.util.List;
import java.util.Map;

import com.pc.entity.Customer;
import com.pc.vo.CustomerVO;

public interface ICustomerService {
	public Customer registerCustomer(CustomerVO customer);
//	public String updateCustomer(CustomerVO customer);
//	public String viewCustomerById(Long customerId);
//	public String deleteCustomer(Long customerId);
	public List<Customer> getAllCustomer();
}
