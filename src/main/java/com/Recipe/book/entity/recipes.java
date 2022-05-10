package com.Recipe.book.entity;

import java.time.LocalDate;
import java.util.Locale.Category;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "recipes")
public class recipes {
	
	@Id
	@Column(name = "RecipeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int recipeId;
	
	private String recipeName;
	
	private String instructions;
	
	private String category;
	
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private  LocalDate Date;
	
	private int serving;
	
	@OneToOne(fetch = FetchType.EAGER,mappedBy="recipes",cascade = CascadeType.ALL)
	@JoinColumn(name = "ingrediantId")
	private Ingredients ingredients;

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
	

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	
	public int getServing() {
		return serving;
	}

	public void setServing(int serving) {
		this.serving = serving;
	}

	public recipes() {
		super();
	}

	@Override
	public String toString() {
		return "recipes [recipeId=" + recipeId + ", recipeName=" + recipeName + ", instructions=" + instructions
				+ ", category=" + category + ", Date=" + Date + ", serving=" + serving + ", ingredients=" + ingredients
				+ "]";
	}

	public recipes(int recipeId, String recipeName, String instructions, String category, LocalDate date, int serving,
			Ingredients ingredients) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.instructions = instructions;
		this.category = category;
		Date = date;
		this.serving = serving;
		this.ingredients = ingredients;
	}

	public Ingredients getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}


}
