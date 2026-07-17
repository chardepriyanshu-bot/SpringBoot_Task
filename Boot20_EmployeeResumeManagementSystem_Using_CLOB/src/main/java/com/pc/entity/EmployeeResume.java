package com.pc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
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
@Table(name="Employee_Resume")
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResume {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long employeeId;
	@NonNull
	private String empName;
	@NonNull
	private String designation;
	@NonNull
	@Lob
	@Column(columnDefinition = "CLOB")
	private String resumeContent;
}
