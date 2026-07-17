package com.pc.service;

import java.util.List;
import java.util.Optional;

import com.pc.entity.Cricketer;

public interface ICricketService {
	public Cricketer saveCricketer(Cricketer cricketer);
	public List<Cricketer> getAllCricketers();
	public Cricketer  getCricketerById(Long playerId);
	public Cricketer updateCricketer(Cricketer cricketer);
	public String deleteCricketer(Long playerId);
}
