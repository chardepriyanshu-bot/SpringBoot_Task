package com.pc.service;

import java.util.List;

import com.pc.entity.Doctor;

public interface IDoctorService {
	public List<Doctor> getByDoctorNameLike(String pattern);
	public List<Doctor> getBySpecializationIn(List<String> specializations);
	public List<Doctor> getByDoctorNameStartingWith(String prefix);
	public List<Doctor> getByDoctorNameEndingWith(String suffix);
	public List<Doctor> getByCityIn(List<String> cities);
	public List<Doctor> getByHospitalNameLike(String pattern);
	public List<Doctor> getByEmailEndingWith(String domain);
	public List<Doctor> getBySpecializationStartingWith(String prefix);
}
