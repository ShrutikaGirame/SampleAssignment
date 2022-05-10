package com.Recipe.book.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.Recipe.book.entity.user;

@Service
public interface UserService {
public user createUser(user user) throws Exception;
	
	public user getUser(Integer userId) throws Exception;

	public List<user> findAllUsers();

	public Optional<user> findById(int id);

	void deleteUser(int userId);

}
