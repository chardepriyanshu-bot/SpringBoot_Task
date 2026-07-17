package com.pc.service;

import java.util.List;

import com.pc.entity.Loan;
import com.pc.vo.LoanVO;

public interface ILoanService {
	public String addLoan(LoanVO loan);
	public List<Loan> getAllLoan();
}
