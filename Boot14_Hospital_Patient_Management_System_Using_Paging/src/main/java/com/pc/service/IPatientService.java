package com.pc.service;

import org.springframework.data.domain.Page;

import com.pc.entity.Patient;

public interface IPatientService {
	public Page<Patient> getPatientByPages(int pageNo,int pageSize );
}
