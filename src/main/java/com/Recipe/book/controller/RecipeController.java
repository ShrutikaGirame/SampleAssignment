package com.Recipe.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe.book.entity.recipes;
import com.Recipe.book.service.RecipeService;

@RestController
@RequestMapping("/Recipe")

public class RecipeController {
	
	@Autowired RecipeService recipeService;
	
	@GetMapping("/get/{recipeName}")
	public recipes getrecipe(@PathVariable(value = "Name") String recipeName) throws Exception{
		recipes recipe = recipeService.getrecipe(recipeName);
		return recipe;
			
		}
	@PostMapping("/AddRecipe")
	public recipes createRecipe(@RequestBody recipes recipe) throws Exception {
		recipes recipe1 = recipeService.createrecipe(recipe);
		
		return recipe1;
	}
	@DeleteMapping("/Delete/{id}")
	public void deleteRecipe(@PathVariable(value = "id") int id) {
		 recipeService.deleterecipe(id);
}
}
