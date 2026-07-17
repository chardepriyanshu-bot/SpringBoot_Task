package com.pc.service;

import java.util.List;
import java.util.Map;

import com.pc.entity.Account;
import com.pc.vo.AccountVO;

public interface IAccountService {
	public void addAccount(AccountVO account);
	public List<Account> getAllAccount();
}
