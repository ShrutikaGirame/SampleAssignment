package com.Recipe.book.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.Ingredients;

@Repository
public interface IngredientsRepo extends CrudRepository<Ingredients, Integer> {

	
	//Optional<Ingredients> findByIngredientId(int ingredientId);
}
