package com.pc.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="transaction_bms")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="trnx_bms_seq", allocationSize = 1, initialValue = 101)
	private Long transactionId;
	private String transactionType;
	private Double amount;
	private String remarks;
	@ManyToOne
	@JoinColumn(name="accountNumber")
	private Account account;
	
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDateTime transactionDate;
}
