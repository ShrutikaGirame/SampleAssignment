package com.Recipe.book.service;

import org.springframework.stereotype.Service;

import com.Recipe.book.ExceptionHandling.RecipeNotFoundException;
import com.Recipe.book.entity.recipes;

@Service
public interface RecipeService {
	
	recipes getrecipe(String recipeName) throws RecipeNotFoundException;
	
	recipes createrecipe(recipes recipe);
	
	recipes updaterecipe(recipes recipe, int id);

	void deleteRecipe(int recipeId);



}
