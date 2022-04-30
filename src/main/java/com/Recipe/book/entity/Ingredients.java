package com.Recipe.book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IngredientsList")
public class Ingredients {
	
	
		@Id
		private int id;
		private String ingredients;

		
		public Ingredients(int id, String ingredients) {
			super();
			this.id = id;
			this.ingredients = ingredients;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Ingredients() {
			super();
		}

		public String getIngredients() {
			return ingredients;
		}

		public void setIngredients(String ingredients) {
			this.ingredients = ingredients;
		}

		@Override
		public String toString() {
			return "Ingredients [id=" + id + ", ingredients=" + ingredients + "]";
		}

		
	}
