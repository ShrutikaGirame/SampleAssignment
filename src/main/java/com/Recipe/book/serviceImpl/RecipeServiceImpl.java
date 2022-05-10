package com.Recipe.book.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recipe.book.entity.recipes;
import com.Recipe.book.entity.user;
import com.Recipe.book.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired RecipeService recipeService;

	@Override
	public recipes getrecipe(String recipeName) {
		return recipeService.getrecipe(recipeName);
		
	}

	@Override
	public recipes createrecipe(recipes recipe) {
		recipes recipe1 = recipeService.createrecipe(recipe);
		return recipe1;
	}

	@Override
	public recipes updaterecipe(Integer recipeId, recipes recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public recipes deleterecipe(Integer recipeId) {
		return recipeService.deleterecipe(recipeId);
	}

	@Override
	public Object recipesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
