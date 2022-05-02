package com.Recipe.book.entity;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ingredientId")
	private int ingredientId;
	
	public int getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public HashMap<String, String> getIngredient() {
		return ingredient;
	}

	public void setIngredient(HashMap<String, String> ingredient) {
		this.ingredient = ingredient;
	}

	private HashMap<String ,String> ingredient = new HashMap<String,String>();

	public Ingredients(int ingredientId, HashMap<String, String> ingredient) {
		super();
		this.ingredientId = ingredientId;
		this.ingredient = ingredient;
	}

	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ingredient [ingrediantId=" + ingredientId + ", ingredient=" + ingredient + "]";
	}
	
	@OneToOne
	public recipes recipes;
		
	}
