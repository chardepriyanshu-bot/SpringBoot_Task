package com.pc.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="University")
@RequiredArgsConstructor
@NoArgsConstructor
public class University {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(sequenceName ="u_seq",initialValue = 1)
	private Long universityId;
	@NonNull
	private String universityName;
	@NonNull
	private String city;
	@NonNull
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn
	private List<Course> course;
}
