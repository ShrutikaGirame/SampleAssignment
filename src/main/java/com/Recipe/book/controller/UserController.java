package com.Recipe.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Recipe.book.ExceptionHandling.UserNotFoundException;
import com.Recipe.book.entity.user;
import com.Recipe.book.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/get/{id}")
public user findUserById(@PathVariable(value = "id") int id) throws UserNotFoundException{
	user user = userService.getUser(id);
	return user;
		
	}
	
	@PostMapping("/Create")
	public user createUser(@RequestBody user user) throws Exception {
		user user1 = userService.createUser(user);
		
		return user1;
	}
	
	@DeleteMapping("/Delete/{id}")
	public void deleteUser(@PathVariable(value = "id") int id) {
		 userService.deleteUser(id);
}

}
