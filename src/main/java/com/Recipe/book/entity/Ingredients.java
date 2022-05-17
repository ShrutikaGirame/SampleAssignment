package com.Recipe.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredients {
	
	
	@Id
	@Column(name = "ingredientId")
	private int ingredientId;
	private String Ingredients;
	public int getIngredientId() {
		return ingredientId;
	}
	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}
	public String getIngredients() {
		return Ingredients;
	}
	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}
	@Override
	public String toString() {
		return "Ingredients [ingredientId=" + ingredientId + ", Ingredients=" + Ingredients + "]";
	}
	public Ingredients(int ingredientId, String ingredients) {
		super();
		this.ingredientId = ingredientId;
		Ingredients = ingredients;
	}
	

	}




