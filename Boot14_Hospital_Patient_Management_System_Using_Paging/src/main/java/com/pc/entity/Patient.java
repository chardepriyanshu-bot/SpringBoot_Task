package com.pc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@Table(name="hospital_hms")
@ToString
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer patientId;
	private String patientName;
	private String disease;
	private Integer age;
}
