package com.pc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.Doctor;
import com.pc.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorRepository repository;

	@Override
	public List<Doctor> getByDoctorNameLike(String pattern) {
		return repository.findByDoctorNameLike(pattern);
	}

	@Override
	public List<Doctor> getBySpecializationIn(List<String> specializations) {
		return repository.findBySpecializationIn(specializations);
	}

	@Override
	public List<Doctor> getByDoctorNameStartingWith(String prefix) {
		return repository.findByDoctorNameStartingWith(prefix);
	}

	@Override
	public List<Doctor> getByDoctorNameEndingWith(String suffix) {
		return repository.findByDoctorNameEndingWith(suffix);
	}

	@Override
	public List<Doctor> getByCityIn(List<String> cities) {
		return repository.findByCityIn(cities);
	}

	@Override
	public List<Doctor> getByHospitalNameLike(String pattern) {
		return repository.findByHospitalNameLike(pattern);
	}

	@Override
	public List<Doctor> getByEmailEndingWith(String domain) {
		return repository.findByEmailEndingWith(domain);
	}

	@Override
	public List<Doctor> getBySpecializationStartingWith(String prefix) {
		return repository.findBySpecializationStartingWith(prefix);
	}

}
