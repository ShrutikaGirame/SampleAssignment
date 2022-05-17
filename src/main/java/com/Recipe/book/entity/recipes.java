package com.Recipe.book.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.sun.istack.NotNull;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "recipes")
public class recipes {
	
	public recipes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public recipes(int recipeId, String recipeName, LocalDateTime localdatetime, boolean vegetarian,
			String instructions, int serving, List<Ingredients> ingredients) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.localdatetime = localdatetime;
		this.vegetarian = vegetarian;
		this.instructions = instructions;
		this.serving = serving;
		this.ingredients = ingredients;
	}
	@Id
	@Column(name = "RecipeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int recipeId;
	private String recipeName;
	@JsonFormat(pattern="dd‐MM‐yyyy HH:mm", shape=Shape.STRING)
	private  LocalDateTime localdatetime;
	private boolean vegetarian;
	private String instructions;
	private int serving;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "recipeId")
	private List<Ingredients> ingredients;
	@Override
	public String toString() {
		return "recipes [recipeId=" + recipeId + ", recipeName=" + recipeName + ", localdatetime=" + localdatetime
				+ ", vegetarian=" + vegetarian + ", instructions=" + instructions + ", serving=" + serving
				+ ", ingredients=" + ingredients + "]";
	}
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
	public LocalDateTime getLocaldatetime() {
		return localdatetime;
	}
	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public int getServing() {
		return serving;
	}
	public void setServing(int serving) {
		this.serving = serving;
	}
	public List<Ingredients> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

}
