package com.pc.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("loanApplication")
@Qualifier("hdfc")
public final class LoanApplication {
	private ILoanService loanService;
	
	@Autowired
	public LoanApplication(@Qualifier("hdfc")ILoanService loanService) {
		this.loanService=loanService;
	}
	public void apply(String name,double amount) throws LoanProcessingException {
		loanService.applyLoan(name, amount);
	}
	public void reject(int loadId) throws InvalidLoanOperationException {
		loanService.rejectLoan(loadId);
	}
	public void view() {
		loanService.viewApplication();
	}
}
