package com.Recipe.book.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public user getUser(Integer userId) throws Exception {
	
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
	public void deleteUser(int userId) {
		 userRepo.deleteById(userId);
		
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
