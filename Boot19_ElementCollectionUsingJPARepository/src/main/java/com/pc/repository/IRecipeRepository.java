package com.pc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pc.entity.RecipeBook;

public interface IRecipeRepository extends JpaRepository<RecipeBook, Long> {
	 
}
