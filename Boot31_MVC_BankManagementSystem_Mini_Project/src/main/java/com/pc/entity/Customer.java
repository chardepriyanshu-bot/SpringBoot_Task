package com.pc.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer_bms")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="cust_bms_seq", allocationSize = 1, initialValue = 101)
	private Long customerId;
	private String customerName;
	private String email;
	private String mobile;
	private String address;
	private Long aadharNumber;
	@OneToMany(mappedBy = "customer", cascade=CascadeType.ALL)
	private List<Account> account;
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
	private List<Loan> loan;
	
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updateAt;
}
