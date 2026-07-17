package com.pc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.pc.entity.RecipeBook;
import com.pc.service.IRecipeService;

@Controller
public class RecipeController {
	private final IRecipeService service;
	
	public RecipeController(IRecipeService service) {
		this.service=service;
	}
	
	
	public void registerRecipeBook(RecipeBook book) throws IllegalArgumentException {
		System.out.println(service.addRecipeBook(book));
		System.out.println("Added Successfully");
	}

	public void findAllRecipeBook() throws IllegalArgumentException {
		 service.getAllRecipeBook().forEach(System.out::println);
	}

	public void findRecipeBookById(long recipeId) throws IllegalArgumentException{
		System.out.println(service.getRecipeBookById(recipeId));
	}

	public void modifyInGredients(long recipeId, List<String> inGredient) {
		System.out.println(service.updateInGredients(recipeId,inGredient));
		System.out.println("Update Successfully");
	}

	public void removeRecipeBook(long recipeId) {
		 System.out.println(service.deleteRecipeBook(recipeId));
	}
}
