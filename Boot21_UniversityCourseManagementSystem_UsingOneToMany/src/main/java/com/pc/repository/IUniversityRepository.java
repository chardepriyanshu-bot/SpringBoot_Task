package com.pc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.University;

public interface IUniversityRepository extends JpaRepository<University,Long> {

}
