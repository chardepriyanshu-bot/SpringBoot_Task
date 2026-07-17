package com.pc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="Course")
@RequiredArgsConstructor
@NoArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(sequenceName ="course_seq",initialValue = 1)
	private Long courseId;
	@NonNull
	private String courseName;
	@NonNull
	private String duration;
	@NonNull
	private Double fee;
}
