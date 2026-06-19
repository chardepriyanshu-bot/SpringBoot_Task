package com.pc.model;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("courseInfo")
@ConfigurationProperties(prefix="student")
@Data
public class CourseInfo {
	private Integer id;
	private String name;
	private List<String> courses;
}
