package com.Recipe.book.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.Recipe.book.entity.user;
import com.Recipe.book.entity.userRole;

@Service
public interface UserService {
public user createUser(user user) throws Exception;
	
	public user getUser(Integer userId) throws Exception;

	public user deleteUser(Integer userId);

	public user updateUser(Integer userId,user user);

	public user RegisterUser(user user);

	public List<user> findAllUsers();


	public Optional<user> findById(int id);

}
