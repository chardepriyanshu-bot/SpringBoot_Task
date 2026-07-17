package com.pc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.service.ICustomerService;
import com.pc.service.ILoanService;
import com.pc.vo.LoanVO;

@Controller
public class LoanController {
	
	private final ILoanService loanService;
	private final ICustomerService customerService;
	
	public LoanController(@Autowired ILoanService loanService, @Autowired ICustomerService customerService) {
		this.loanService=loanService;
		this.customerService=customerService;
	}
	
	@GetMapping("/registerLoan")
	public String loanRegister(Map<String,Object> map) {
	    map.put("custList", customerService.getAllCustomer());
	    return "registerLoan";
	}
	
	 @PostMapping("/registerLoan")
	public String process(@ModelAttribute("loan") LoanVO loanVO,
	                          Map<String, Object> map) {

	     loanService.addLoan(loanVO);
	     map.put("loanList", loanVO);

	     return "viewLoans";
	    }
	}
