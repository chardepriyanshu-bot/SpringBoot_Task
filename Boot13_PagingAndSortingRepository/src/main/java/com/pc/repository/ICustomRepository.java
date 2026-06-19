package com.pc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.pc.entity.Employee;

public interface ICustomRepository extends PagingAndSortingRepository<Employee, Integer>{

}
