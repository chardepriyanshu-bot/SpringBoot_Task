package com.pc.vo;

import com.pc.entity.Customer;
import com.pc.entity.Transaction;

import lombok.Data;

@Data
public class AccountVO {
	private Long accountNumber;
	private String accountType;
	private Double balance;
	private String branch;
	private String ifscCode;
	private String status="Active";
	private Customer customer;
	private Transaction transaction;
}
