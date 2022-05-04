package com.Recipe.book.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.Recipe.book.entity.user;
import com.Recipe.book.entity.userRole;

@Service
public interface UserService {
public user createUser(user user,Set<userRole>userRole) throws Exception;
	
	public user getUser(String userName) throws Exception;

	public user deleteUser(Integer userId);

	public user updateUser(Integer userId,user user);

	public user RegisterUser(user user);

	public List<user> findAllUsers();

}
