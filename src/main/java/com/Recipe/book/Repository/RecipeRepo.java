package com.Recipe.book.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.recipes;

@Repository
public interface RecipeRepo extends JpaRepository<recipes, Integer> {

	
	Optional<recipes> findByrecipeName (String recipeName);
}
