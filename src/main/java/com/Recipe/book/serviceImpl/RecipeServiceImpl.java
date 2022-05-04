package com.Recipe.book.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recipe.book.Repository.RecipeRepo;
import com.Recipe.book.entity.recipes;
import com.Recipe.book.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired RecipeRepo recipeRepo;

	@Override
	public recipes getrecipe(String recipeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public recipes createrecipe(recipes recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public recipes updaterecipe(Integer recipeId, recipes recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public recipes deleterecipe(Integer recipeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
