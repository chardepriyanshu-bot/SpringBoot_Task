package com.pc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Long studentId;
	private String studentName;
	private String course;
	private String phoneNumber;
}
