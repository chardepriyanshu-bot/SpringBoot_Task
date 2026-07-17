package com.pc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name="college_cms")
@RequiredArgsConstructor
@NoArgsConstructor
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(sequenceName = "s_seq",initialValue = 1)
	private Long collegeId;
	@NonNull
	private String collegeName;
	@NonNull
	private String city;
}
