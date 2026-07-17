package com.pc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FestivalPass {
	private Long passId;
	private String visitorName;
	private String nationality;
	private String festivalCategory;
	private String passType;
	private Integer visitingDays;
	private String email;
}
