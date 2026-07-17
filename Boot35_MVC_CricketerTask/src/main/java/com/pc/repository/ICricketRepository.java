package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.Cricketer;

public interface ICricketRepository extends JpaRepository<Cricketer, Long> {

}
