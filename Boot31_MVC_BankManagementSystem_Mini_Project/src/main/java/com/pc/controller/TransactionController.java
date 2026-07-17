package com.pc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pc.service.ITransactionService;

@Controller
public class TransactionController {
	private final ITransactionService service;
	
	public TransactionController(ITransactionService service) {
		this.service=service;
	}
	
	@GetMapping("/viewTransaction")
	public String viewTransactions(Map<String, Object> map) {
		map.put("transactionList", service.getTransactions());
		return "viewTransaction";
	}
}
