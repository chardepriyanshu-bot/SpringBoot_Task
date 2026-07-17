package com.pc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pc.entity.Account;
import com.pc.service.IAccountService;
import com.pc.vo.AccountVO;

@Controller
public class AccountController {
	private final IAccountService service;
	
	public AccountController(IAccountService service) {
		this.service=service;
	}
	
	@GetMapping("/registerAccount/{customerId}")
	public String showAccountForm(@PathVariable Long customerId,
	                              Model model) {

	    model.addAttribute("account", new AccountVO());
	    model.addAttribute("customerId", customerId);

	    return "account";
	}
	
	@PostMapping("/viewAccount")
	public String viewAccounts(@ModelAttribute("account") AccountVO accountVo,Map<String, Object> map) {
		service.addAccount(accountVo);
		List<Account> acctList=service.getAllAccount();
		map.put("acctList",acctList);
		return "showAccounts";
	}
}
