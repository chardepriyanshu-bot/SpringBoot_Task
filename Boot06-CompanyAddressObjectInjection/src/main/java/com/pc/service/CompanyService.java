package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.model.Company;

@Service
public class CompanyService {
	@Autowired
	private Company company;
	
	public void details() {
		System.out.println(company.toString());
	}
	
}
