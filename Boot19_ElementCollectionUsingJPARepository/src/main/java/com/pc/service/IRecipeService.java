package com.pc.service;

import java.util.List;

import com.pc.entity.RecipeBook;

public interface IRecipeService {
	public RecipeBook addRecipeBook(RecipeBook book) throws IllegalArgumentException;
	public List<RecipeBook> getAllRecipeBook() throws IllegalArgumentException;
	public RecipeBook getRecipeBookById(long recipeId) throws IllegalArgumentException;
	public RecipeBook updateInGredients(long recipeId, List<String> inGredient) throws IllegalArgumentException;
	public String deleteRecipeBook(long recipeId) throws IllegalArgumentException;
}