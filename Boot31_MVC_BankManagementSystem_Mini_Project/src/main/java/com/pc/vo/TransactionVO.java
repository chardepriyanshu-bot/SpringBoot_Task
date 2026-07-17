package com.pc.vo;

import com.pc.entity.Account;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class TransactionVO {
	private Long transactionId;
	private String transactionType;
	private Double amount;
	private String remarks;
	private Account account;
}
