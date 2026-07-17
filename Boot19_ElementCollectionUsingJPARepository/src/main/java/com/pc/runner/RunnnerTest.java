package com.pc.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.controller.RecipeController;
import com.pc.entity.RecipeBook;

@Component
public class RunnnerTest implements CommandLineRunner{

	private final RecipeController ctrl;
	
	public RunnnerTest(RecipeController ctrl) {
		this.ctrl=ctrl;
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*
		  RecipeBook r1 = new RecipeBook(
	                "Biryani",
	                "Indian",
	                List.of("Rice", "Chicken", "Spices"),
	                Set.of("Cook on low flame", "Add saffron")
	        );

	        RecipeBook r2 = new RecipeBook(
	                "Pizza",
	                "Italian",
	                List.of("Flour", "Cheese", "Tomato"),
	                Set.of("Use fresh cheese", "Bake at high temperature")
	        );

	        RecipeBook r3 = new RecipeBook(
	                "Sushi",
	                "Japanese",
	                List.of("Rice", "Fish", "Seaweed"),
	                Set.of("Use fresh fish", "Keep rice sticky")
	        );

	        RecipeBook r4 = new RecipeBook(
	                "Tacos",
	                "Mexican",
	                List.of("Tortilla", "Beans", "Vegetables"),
	                Set.of("Add spicy sauce", "Serve hot")
	        );

	        RecipeBook r5 = new RecipeBook(
	                "Pasta",
	                "Italian",
	                List.of("Pasta", "Sauce", "Vegetables"),
	                Set.of("Boil pasta properly", "Add herbs")
	        );
	        ctrl.registerRecipeBook(r1);
	        ctrl.registerRecipeBook(r2);
	        ctrl.registerRecipeBook(r3);
	        ctrl.registerRecipeBook(r4);
	        ctrl.registerRecipeBook(r5);
	       */
		ctrl.findAllRecipeBook();

	}
	
}
