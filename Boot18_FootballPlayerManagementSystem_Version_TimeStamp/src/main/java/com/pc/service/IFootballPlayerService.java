package com.pc.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.pc.entity.FootballPlayer;

public interface IFootballPlayerService {

	public List<FootballPlayer> findByClub(String club);
	public List<FootballPlayer> findPlayersWithSalaryGreaterThan(Double salary);  
	public List<FootballPlayer> findByPositionAndCountry(String position,
	                                              String country);
	 
	public List<FootballPlayer> findByNameStartsWith( String prefix);
	 
	public List<FootballPlayer> findByJerseyNumberBetween( Integer start,
	                                               Integer end);
	 
	public Long countPlayersByCountry(String country);
	 
	public List<FootballPlayer> findHighestPaidPlayers();

	 
	public int updateSalary(Long id,Double salary);
	 
	public int deleteByClub(String club);
	public List<Object[]> getPlayerNameAndClub();
}
