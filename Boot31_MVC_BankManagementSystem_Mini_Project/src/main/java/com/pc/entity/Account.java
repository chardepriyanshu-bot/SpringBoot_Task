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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="acccount_bms")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="acct_bms_seq", initialValue = 1, allocationSize = 1) //initalvalue type is int , it could not manage long type
	private Long accountNumber;
	private String accountType;
	private Double balance;
	private String branch;
	private String ifscCode;
	private String status="Active";
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	@OneToMany(mappedBy="account", cascade=CascadeType.ALL)
	private List<Transaction> transaction;
	
	//Metadata
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updateAt;
}
