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
import javax.persistence.OneToOne;
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//package com.Recipe.book.entity;
//
//
//
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//
//
//import java.util.List;
//
//
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//
//
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//
//
//
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//
//
//
//
//
//@Entity
//@Table(name = "Recipe")
//public class recipes {
//
//
//
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//private int recipeId;
//
//
//
//@Column
//private String RecipeName;
//
//
//
//
//@Column
//@JsonFormat
//private LocalDate created;
//
//
//
//@Column
//private boolean veg;
//
//
//
//@Column
//private int servings;
//
//
//
//@Column
//private String instructions;
//
//@OneToMany(targetEntity = Ingredients.class, cascade=CascadeType.ALL)
//@JoinColumn(name="RI_fk",referencedColumnName = "recipeId")
//private List<Ingredients> ingredientsList;
//
//public void Recipe( String RecipeName, LocalDate created, boolean veg, int servings, String instructions,
//List<Ingredients> ingredientsList) {
//this.RecipeName = RecipeName;
//this.created = created;
//this.veg = veg;
//this.servings = servings;
//this.instructions = instructions;
//this.ingredientsList = ingredientsList;
//}
//public int getRecipeId() {
//return recipeId;
//}
//
//public void setRecipeId(int recipeId) {
//this.recipeId = recipeId;
//}
//public String getRecipeName() {
//return RecipeName;
//}
//public void setRecipeName(String RecipeName) {
//this.RecipeName = RecipeName;
//}
//public LocalDate getCreated() {
//return created;
//}
//public void setCreated(LocalDate created) {
//this.created = created;
//}
//public boolean isVeg() {
//return veg;
//}
//public void setVeg(boolean veg) {
//this.veg = veg;
//}
//public int getServings() {
//return servings;
//}
//public void setServings(int servings) {
//this.servings = servings;
//}
//public String getInstructions() {
//return instructions;
//}
//public void setInstructions(String instructions) {
//this.instructions = instructions;
//}
//public List<Ingredients> getIngredientsList() {
//return ingredientsList;
//}
//public void setIngredientsList(List<Ingredients> ingredientsList) {
//this.ingredientsList = ingredientsList;
//}
//}