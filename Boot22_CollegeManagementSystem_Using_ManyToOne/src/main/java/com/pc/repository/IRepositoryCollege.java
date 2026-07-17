package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.College;

public interface IRepositoryCollege extends JpaRepository<College, Long> {

}
