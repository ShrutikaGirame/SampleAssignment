package com.Recipe.book.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recipe.book.Repository.RoleRepo;
import com.Recipe.book.Repository.UserRepo;
import com.Recipe.book.entity.user;
import com.Recipe.book.entity.userRole;
import com.Recipe.book.service.UserService;
//import com.Recipe.book.utility.GlobalResources;

@Service
public class UserServiceImpl implements UserService {

//	private Logger logger = GlobalResources.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;
	
	
	@Override
	public user createUser(user user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user getUser(Integer userId) throws Exception {
	
		String methodName = "getUser()";
//		logger.info(methodName = + "called");
		Optional<user> optional = userRepo.findById(userId);
		
		user user1 = optional.get();
		
		if(optional.isPresent())
		{
		}
		else
		{
			throw new Exception("User does not exist");
		}
		return user1;
		

	}

	@Override
	public user deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user updateUser(Integer userId, user user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user RegisterUser(user user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<user> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<user> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
