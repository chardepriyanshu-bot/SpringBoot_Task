package com.pc.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pc.entity.Transaction;
import com.pc.repository.ITransactionRepository;
import com.pc.service.ITransactionService;

@Service
public class TransactionService implements ITransactionService {

	private final ITransactionRepository repository;
	
	public TransactionService(ITransactionRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public List<Transaction> getTransactions() {
		System.out.println("TransactionService.getTransactions()");
		return repository.findAll();
	}

}
