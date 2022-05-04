package com.Recipe.book.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recipe.book.Repository.IngredientsRepo;
import com.Recipe.book.entity.Ingredients;
import com.Recipe.book.service.IngredientsService;

@Service
public class IngredientsServiceImpl implements IngredientsService {
	
	@Autowired IngredientsRepo ingredientsRepo;

	@Override
	public Ingredients getIngredient(Integer ingredientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredients addIngredient(Ingredients ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredients updateIngredient(Integer ingredientId, Ingredients ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

}
