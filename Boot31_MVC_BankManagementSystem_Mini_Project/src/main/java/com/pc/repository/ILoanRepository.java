package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Loan;

public interface ILoanRepository extends JpaRepository<Loan, Long> {

}
