package com.pc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pc.entity.RecipeBook;
import com.pc.repository.IRecipeRepository;

@Service
public class IRecipeServiceImpl implements IRecipeService{
	private final IRecipeRepository repo;
	
	public IRecipeServiceImpl(IRecipeRepository repo) {
		this.repo=repo;
	}

	@Override
	public RecipeBook addRecipeBook(RecipeBook book) throws IllegalArgumentException {
		if(book==null) throw new IllegalArgumentException("Invalid Input");
		return repo.save(book);
	}

	@Override
	public List<RecipeBook> getAllRecipeBook() throws IllegalArgumentException {
		List<RecipeBook> list=repo.findAll();
		if(list.isEmpty()) throw new IllegalArgumentException("Table is Empty");
		return list;
	}

	@Override
	public RecipeBook getRecipeBookById(long recipeId) throws IllegalArgumentException{
		Optional<RecipeBook> book=repo.findById(recipeId);
		return book.orElseThrow(()->new IllegalArgumentException("Table is Empty"));
	}

	@Override
	public RecipeBook updateInGredients(long recipeId, List<String> inGredient) {
		  RecipeBook recipe = repo.findById(recipeId).get();

		    recipe.setInGredients(inGredient);

		    return repo.save(recipe);
	}

	@Override
	public String deleteRecipeBook(long recipeId) {
		if(recipeId==0)  throw new IllegalArgumentException("Invalid Input");
		repo.deleteById(recipeId);
		return "Deleted with id ="+recipeId;
	}
	
	
}
