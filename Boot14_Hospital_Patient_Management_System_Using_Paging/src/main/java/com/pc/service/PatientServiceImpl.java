package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pc.entity.Patient;
import com.pc.repository.IPatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientRepository repository;
	
	@Override
	public Page<Patient> getPatientByPages(int pageNo,int pageSize ) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Patient> page=repository.findAll(pageable);
		return page;
	}

}
