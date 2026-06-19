package com.pc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.entity.FootballPlayer;
import com.pc.repository.IFootballPlayerRepository;

@Service
public class FootBallPlayerServiceImpl implements IFootballPlayerService{

	@Autowired
	private IFootballPlayerRepository repo;
	
	@Override
	public List<FootballPlayer> findByClub(String club) {
		return repo.findByClub(club) ;
	}

	@Override
	public List<FootballPlayer> findPlayersWithSalaryGreaterThan(Double salary) {
		return repo.findPlayersWithSalaryGreaterThan(salary);
	}

	@Override
	public List<FootballPlayer> findByPositionAndCountry(String position, String country) {
		return repo.findByPositionAndCountry(position,country);
	}

	@Override
	public List<FootballPlayer> findByNameStartsWith(String prefix) {
		 return repo.findByNameStartsWith(prefix);
	}

	@Override
	public List<FootballPlayer> findByJerseyNumberBetween(Integer start, Integer end) {
		return repo.findByJerseyNumberBetween(start, end);
	}

	@Override
	public Long countPlayersByCountry(String country) {
		return repo.countPlayersByCountry(country);
	}

	@Override
	public List<FootballPlayer> findHighestPaidPlayers() {
		return repo.findHighestPaidPlayers();
	}

	@Override
	public int updateSalary(Long id, Double salary) {
		return repo.updateSalary(id, salary);
	}

	@Override
	public int deleteByClub(String club) {
		return repo.deleteByClub(club);
	}

	@Override
	public List<Object[]> getPlayerNameAndClub() {	
		return repo.getPlayerNameAndClub();
	}

}
