package com.Recipe.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.recipes;

@Repository
public interface RecipeRepo extends CrudRepository<recipes, Integer> {

	
	//Optional<recipes> findByrecipeName (String recipeName);
}
