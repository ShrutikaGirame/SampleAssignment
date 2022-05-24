package com.Recipe.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe.book.ExceptionHandling.RecipeNotFoundException;
import com.Recipe.book.entity.recipes;
import com.Recipe.book.service.RecipeService;

@RestController
@RequestMapping("/Recipe")

public class RecipeController {
	
	@Autowired RecipeService recipeService;
	
	@GetMapping("/get/{recipeName}")
	public recipes getrecipe(@PathVariable ("recipeName") String recipeName) throws RecipeNotFoundException{
		recipes recipe = recipeService.getrecipe(recipeName);
		return recipe;
			
		}
	@PostMapping("/AddRecipe")
	public recipes createrecipe(@RequestBody recipes recipe) throws Exception {
		recipes vegmanchurian = recipeService.createrecipe(recipe);
		
		return vegmanchurian;
	}
	@DeleteMapping("/Delete/{id}")
	public void deleteRecipe(@PathVariable(value = "id") int id) {
		 recipeService.deleteRecipe(id);
	}
	
	@PutMapping("Update/{id}")
	public recipes updaterecipe(@PathVariable(value = "id")int id,@RequestBody recipes recipe) {
		
		recipes Updated = recipeService.updaterecipe(id, recipe);
		return Updated;
		
	}
}
