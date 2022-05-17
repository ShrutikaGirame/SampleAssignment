package com.Recipe.book.ExceptionHandling;

public class RecipeNotFoundException extends Exception {
	
	public RecipeNotFoundException() {
		super();
	}
	
	public RecipeNotFoundException(String msg) {
		super(msg);
		
	}

}
