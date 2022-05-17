package com.Recipe.book.ExceptionHandling;

public class UserNotFoundException extends Exception{
	
	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String msg) {
		super(msg);	
	}

}
