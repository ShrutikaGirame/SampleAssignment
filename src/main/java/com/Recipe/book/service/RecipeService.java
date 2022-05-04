package com.Recipe.book.service;

import org.springframework.stereotype.Service;

import com.Recipe.book.entity.recipes;

@Service
public interface RecipeService {
	
	recipes getrecipe(String recipeName);
	
	recipes createrecipe(recipes recipe);
	
	recipes updaterecipe(Integer recipeId, recipes recipe);
	
	recipes deleterecipe(Integer recipeId);

}
