package com.Recipe.book.service;

import org.springframework.stereotype.Service;

import com.Recipe.book.ExceptionHandling.UserNotFoundException;
import com.Recipe.book.entity.user;

@Service
public interface UserService {
    
	
	public user createUser(user user) throws Exception;
	
	public user getUser(Integer userId) throws UserNotFoundException;

	void deleteUser(int userId);

}
