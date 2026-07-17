package com.pc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cricket_academy_db")
public class Cricketer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long playerId;
	private String playerName;
	private String teamName;
	private String role;
	private String battingStyle;
	private Integer jerseyNumber;
	
}
