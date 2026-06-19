package com.pc.sbeans;

import org.springframework.stereotype.Component;

public class Loan {
	private int loanId;
	private String applicantName;
	private double amount;
	
	public Loan(int loanId, String applicantName, double amount) {
		super();
		this.loanId = loanId;
		this.applicantName = applicantName;
		this.amount = amount;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\nLoanId=" + loanId + "\nApplicant Name=" + applicantName + "\namount=" + amount ;
	}
	
}
