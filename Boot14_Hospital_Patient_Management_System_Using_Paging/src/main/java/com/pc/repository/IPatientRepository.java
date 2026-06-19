package com.pc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pc.entity.Patient;

public interface IPatientRepository extends PagingAndSortingRepository<Patient,Integer> {

}
