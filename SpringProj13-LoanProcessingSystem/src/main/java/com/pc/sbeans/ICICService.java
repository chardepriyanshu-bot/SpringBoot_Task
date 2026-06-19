package com.pc.sbeans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("icic")
public final class ICICService implements ILoanService {

	private final static int BRANCHCODE=12;
	private final static double INTERESTRATE=14.0;
	private String managerName="John Kick";
	
	private Map<Integer,Loan> loanMap=new HashMap<>();
	private static int loanId=0;
	public String getManagerName() {
		return managerName;
	}
	
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	@Override
	public void applyLoan(String name,double amount) throws LoanProcessingException {
		if(amount<0 || name==null) {
			throw new LoanProcessingException("Name or Amount must be valid");
		}else {
			loanMap.put(loanId++,new Loan(loanId,name,amount));
			System.out.println("Applied for Loan");
		}
	}

	@Override
	public void rejectLoan(int loanId) throws InvalidLoanOperationException {
		if(loanId!=0) {
			loanMap.remove(loanId);
			System.out.println("Reject Loan.");
		}
		else
			throw new InvalidLoanOperationException("Loan Id must be valid");
	}

	@Override
	public void viewApplication() {
		  loanMap.forEach((k,v)->{
			  System.out.println(loanMap.getOrDefault(k, v).toString());
		  });
	}
	
}
