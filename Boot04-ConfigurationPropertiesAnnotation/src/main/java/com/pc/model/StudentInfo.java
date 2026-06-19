package com.pc.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="student")

public class StudentInfo {
	private Integer id;
	private String name;
	private String course;
	private Double fee;
	private String institute;
}
