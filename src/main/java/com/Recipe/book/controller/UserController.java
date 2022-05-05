package com.Recipe.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe.book.entity.user;
import com.Recipe.book.service.UserService;

@RestController
@RequestMapping("user")

public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/get/{username}")
public user getUser(@PathVariable("userName") String userName) throws Exception {
		
		String methodName = "getUser()";
		
		return this.userservice.getUser(userName);
	}

}
