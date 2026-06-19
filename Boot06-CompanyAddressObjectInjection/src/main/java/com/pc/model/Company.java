package com.pc.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company")
@ConfigurationProperties(prefix="company")
@Data
public class Company {
	private Integer id;
	private String name;
	private Address address;
}
