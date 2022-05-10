package com.Recipe.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.Ingredients;

@Repository
public interface IngredientsRepo extends CrudRepository<Ingredients, Integer> {

}
