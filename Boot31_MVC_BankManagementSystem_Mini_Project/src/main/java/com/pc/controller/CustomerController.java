package com.pc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.entity.Customer;
import com.pc.service.ICustomerService;
import com.pc.vo.AccountVO;
import com.pc.vo.CustomerVO;

@Controller
public class CustomerController {
	
	private final ICustomerService service;
	
	public CustomerController(ICustomerService service) {
		this.service=service;
	}
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	  public String showAccountForm(@ModelAttribute("customer") CustomerVO customerVO) {
	    return "showForm";
	}
	
	@PostMapping("/viewCustomer")
	public String viewCustomer(@ModelAttribute("customer") CustomerVO customer,Map<String, Object> map) {
		Customer savedCustomer =service.registerCustomer(customer);
		List<Customer> cust=service.getAllCustomer();
		map.put("custList", cust);
		 return "redirect:/registerAccount/" + savedCustomer.getCustomerId();
	}
}
