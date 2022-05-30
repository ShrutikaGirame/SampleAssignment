package com.Recipe.book.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

/////////////////////////////////////////////////////////////////////////////////////////////////////

//@Entity
//@Table(name = "INGREDIENTS")
//public class Ingredients {
//
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//@JsonIgnore
//private int id;
//
//@Column
//private String ingredientsList;
//
//
//
//public Ingredients() {
//super();
//}
//
//public Ingredients(String ingredientsList) {
//super();
//this.ingredientsList = ingredientsList;
//
//}
//
//public int getId() {
//return id;
//}
//
//public void setId(int id) {
//this.id = id;
//}
//
//
//
//public String getIngredientsList() {
//return ingredientsList;
//}
//
//
//
//public void setIngredientsList(String ingredientsList) {
//this.ingredientsList = ingredientsList;
//}
//
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//@Entity
//@Table(name = "ingredient")
//public class Ingredients {
//
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//@Column(name = "ingredientId")
//private int ingredientId;
//
//public int getIngredientId() {
//return ingredientId;
//}
//
//
//
//public void setIngredientId(int ingredientId) {
//this.ingredientId = ingredientId;
//}
//
//
//
//public HashMap<String, String> gettIngredient() {
//return ingredient;
//}
//
//
//
//public void setIngredient(HashMap<String, String> ingredient) {
//this.ingredient = ingredient;
//}
//
//
//
//private HashMap<String ,String> ingredient = new HashMap<String,String>();
////private int ingrediantId;
//
//
//
//public void Ingredient(int ingredientId, HashMap<String, String> ingredient) {
//this.ingredientId = ingredientId;
//this.ingredient = ingredient;
//}
//@Override
//public String toString() {
//return "Ingredient [ingrediantId=" + ingredientId + ", ingredient=" + ingredient + "]";
//}
//}

