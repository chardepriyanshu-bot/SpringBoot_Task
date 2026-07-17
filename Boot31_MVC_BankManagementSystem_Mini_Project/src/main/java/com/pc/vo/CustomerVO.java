package com.pc.vo;

import java.util.List;

import com.pc.entity.Account;
import com.pc.entity.Loan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NonNull;

@Data
public class CustomerVO {
	private Long customerId;
	private String customerName;
	private String email;
	private String mobile;
	private String address;
	private Long aadharNumber;
	private List<Account> account;
 	private List<Loan> loan;
}
