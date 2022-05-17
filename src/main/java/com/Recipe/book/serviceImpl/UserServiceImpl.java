package com.Recipe.book.serviceImpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recipe.book.ExceptionHandling.UserNotFoundException;
import com.Recipe.book.Repository.UserRepo;
import com.Recipe.book.entity.user;
import com.Recipe.book.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public user createUser(user user) throws Exception {
		user user1 = userRepo.save(user);
		return user1;
	}

	@Override
	public user getUser(Integer userId) throws UserNotFoundException {
	
		Optional<user> optional = userRepo.findById(userId);
		
		
		
		if(optional.isPresent())
		{
			user user1 = optional.get();
			return user1;
		}
		else {
			throw new UserNotFoundException("User Doesn't Exist");
		}

	}

	@Override
	public void deleteUser(int userId) {
		 userRepo.deleteById(userId);
		
	}



}
