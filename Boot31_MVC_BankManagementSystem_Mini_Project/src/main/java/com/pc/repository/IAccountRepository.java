package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Long> {

}
