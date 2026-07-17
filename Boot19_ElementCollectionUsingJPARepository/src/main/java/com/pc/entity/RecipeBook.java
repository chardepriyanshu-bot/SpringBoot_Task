package com.pc.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="RecipeBook_tb")
@RequiredArgsConstructor
@NoArgsConstructor
public class RecipeBook {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long recipeId;
	@NonNull
	private String recipeName;
	@NonNull
	private String cuisine;
	
	@NonNull
	@ElementCollection(fetch=FetchType.EAGER)
	private List<String> inGredients;
	@ElementCollection(fetch=FetchType.EAGER)
	@NonNull
	private Set<String> cookingTips;
}
