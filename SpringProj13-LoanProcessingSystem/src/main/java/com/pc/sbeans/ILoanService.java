package com.pc.sbeans;

public interface ILoanService {
	public void applyLoan(String name,double amount) throws LoanProcessingException;
	public void rejectLoan(int loanId) throws InvalidLoanOperationException;
	public void viewApplication();
}
