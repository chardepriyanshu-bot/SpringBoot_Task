package com.pc.implementation;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.pc.entity.Loan;
import com.pc.repository.ILoanRepository;
import com.pc.service.ILoanService;
import com.pc.vo.LoanVO;

@Service
public class LoanService implements ILoanService {
	
	public final ILoanRepository loanRepository;
	
	public LoanService(ILoanRepository loanRepository) {
		super();
		this.loanRepository = loanRepository;
	}

	@Override
	public String addLoan(LoanVO loanVo) {
		Loan loan=new Loan();
		BeanUtils.copyProperties(loanVo, loan);
		Loan l=loanRepository.save(loan);
		return "Loan is approved with "+l.getLoanId();
	}

	@Override
	public List<Loan> getAllLoan() {
		return loanRepository.findAll();
	}

}
