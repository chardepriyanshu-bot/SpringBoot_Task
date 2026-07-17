package com.pc.vo;

import com.pc.entity.Customer;
import lombok.Data;

@Data
public class LoanVO {
	private Long loanId;
	private String loanType;
	private Double loanAmount;
	private Double interestRate;
	private String loanStatus="Active";
	private Customer customer;
}
