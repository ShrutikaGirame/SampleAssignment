package com.Recipe.book.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recipe.book.ExceptionHandling.RecipeNotFoundException;
import com.Recipe.book.ExceptionHandling.UserNotFoundException;
import com.Recipe.book.Repository.RecipeRepo;
import com.Recipe.book.entity.recipes;
import com.Recipe.book.entity.user;
import com.Recipe.book.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired 
	private RecipeRepo recipeRepo;

	@Override
	public recipes getrecipe(String recipeName) throws RecipeNotFoundException {
      
		Optional<recipes> optional = recipeRepo.findByrecipeName(recipeName);
		
		
		
		if(optional.isPresent())
		{
			recipes recipe = optional.get();
			return recipe;
		}
		else {
			throw new RecipeNotFoundException("Recipe Doesn't Exist");
		}
		
	}

	@Override
	public recipes createrecipe(recipes recipe) {
		return recipeRepo.save(recipe);
	}

	@Override
	public recipes updaterecipe(int id,recipes recipe) {
	recipes newrecipe = recipeRepo.findById(id).get();
	newrecipe.setInstructions(recipe.getInstructions());
		return recipeRepo.save(newrecipe);
	}

	@Override
	public void deleteRecipe(int recipeId) {
		 recipeRepo.deleteById(recipeId);
		
	}


}
