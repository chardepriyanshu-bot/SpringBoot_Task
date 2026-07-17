package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Transaction;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

}
