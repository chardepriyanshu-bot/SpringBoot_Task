package com.pc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Product_tb")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer productId;
	private String productName;
	private String description;
	private double price;
}
