package com.pc.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pc.entity.Account;
import com.pc.entity.Customer;
import com.pc.repository.IAccountRepository;
import com.pc.repository.ICustomerRepository;
import com.pc.service.IAccountService;
import com.pc.vo.AccountVO;

@Service
public class AccountService implements IAccountService {

	private final IAccountRepository accountRepository;
	private final ICustomerRepository customerRepository;
	
	public AccountService(IAccountRepository accountRepository, ICustomerRepository customerRepository) {
		this.accountRepository=accountRepository;
		this.customerRepository=customerRepository;
	}
	 @Override
	    public void addAccount(AccountVO accountVo) {
	        Account account = new Account();
	        account.setAccountType(accountVo.getAccountType());
	        account.setBalance(accountVo.getBalance());
	        account.setBranch(accountVo.getBranch());
	        account.setIfscCode(accountVo.getIfscCode());
	        account.setStatus(accountVo.getStatus());

 	        Customer customer = customerRepository.findById(accountVo.getCustomer().getCustomerId())
	                .orElseThrow(() -> new RuntimeException("Customer not found"));

	        account.setCustomer(customer);

	        accountRepository.save(account);
	    }

	@Override
	@Transactional
	public List<Account> getAllAccount() {
		return accountRepository.findAll();
	}

}
