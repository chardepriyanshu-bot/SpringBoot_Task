package com.pc.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("address")
@ConfigurationProperties(prefix="company")
@Data
public class Address {
	private String city;
	private String state;
	private Integer pincode;
}
