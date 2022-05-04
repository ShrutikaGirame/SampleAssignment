package com.Recipe.book.service;

import org.springframework.stereotype.Service;

import com.Recipe.book.entity.Ingredients;

@Service
public interface IngredientsService {
	
	Ingredients getIngredient(Integer ingredientId);
	
	Ingredients addIngredient(Ingredients ingredient);
	
	Ingredients updateIngredient(Integer ingredientId, Ingredients ingredient );
}
