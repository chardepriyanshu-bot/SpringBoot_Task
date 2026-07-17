package com.pc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pc.entity.Cricketer;
import com.pc.repository.ICricketRepository;

@Service
public class CricketServiceImpl implements ICricketService {

	private final ICricketRepository repository;
	
	CricketServiceImpl(ICricketRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public Cricketer saveCricketer(Cricketer cricketer) {
		return repository.save(cricketer);
	}

	@Override
	public List<Cricketer> getAllCricketers() {
		return repository.findAll();
	}

	@Override
	public Cricketer getCricketerById(Long playerId) {
		return repository.findById(playerId).orElseThrow(()-> new IllegalArgumentException());
	}

	@Override
	public Cricketer updateCricketer(Cricketer cricketer) {
		return repository.save(cricketer);
	}

	@Override
	public String deleteCricketer(Long playerId) {
		repository.deleteById(playerId);
		return "Cricketer Deleted.";
	}

}
