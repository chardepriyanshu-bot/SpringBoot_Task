package com.pc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.pc.entity.FootballPlayer;

public interface IFootballPlayerRepository extends JpaRepository<FootballPlayer, Long> {
	@Query("from FootballPlayer f where f.club=:club")
	public List<FootballPlayer> findByClub(@Param("club")String club);
	@Query("SELECT f FROM FootballPlayer f WHERE f.salary > :salary")
	public List<FootballPlayer> findPlayersWithSalaryGreaterThan(@Param("salary") Double salary);
	@Query("SELECT f FROM FootballPlayer f WHERE f.position = :position AND f.country = :country")
	public List<FootballPlayer> findByPositionAndCountry(@Param("position") String position,
	                                              @Param("country") String country);
	@Query("SELECT f FROM FootballPlayer f WHERE f.playerName LIKE CONCAT(:prefix, '%')")
	public List<FootballPlayer> findByNameStartsWith(@Param("prefix") String prefix);
	@Query("SELECT f FROM FootballPlayer f WHERE f.jerseyNumber BETWEEN :start AND :end")
	public List<FootballPlayer> findByJerseyNumberBetween(@Param("start") Integer start,
	                                               @Param("end") Integer end);
	@Query("SELECT COUNT(f) FROM FootballPlayer f WHERE f.country = :country")
	public Long countPlayersByCountry(@Param("country") String country);
	@Query("SELECT f FROM FootballPlayer f ORDER BY f.salary DESC")
	public List<FootballPlayer> findHighestPaidPlayers();
	@Modifying
	@Transactional
	@Query("update FootballPlayer f set f.salary=:salary,f.version = f.version + 1,f.updateOn = CURRENT_TIMESTAMP where f.playerId=:playerid")
	public int updateSalary(@Param("playerid") Long id, @Param("salary") Double salary);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM FootballPlayer f WHERE f.club = :club")
	int deleteByClub(@Param("club") String club);
	@Query("SELECT f.playerName, f.club FROM FootballPlayer f")
	List<Object[]> getPlayerNameAndClub();
}
