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
	public user createUser(user user, Set<userRole> userRole) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user getUser(String userName) throws Exception {
	
		String methodName = "getUser()";
//		logger.info(methodName = + "called");
		Optional<user> optional = userRepo.findByUserName(userName);
		if(Optional.empty() != null) {
			
			throw new Exception("User does not Exists");
		}
		user user = optional.get();
		return user;

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

}
