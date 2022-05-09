package com.Recipe.book.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.user;

@Repository
public interface UserRepo extends JpaRepository<user,Integer>  {
	


//	Optional<user> findByUserId(String userName);
//	
//	public user getUserByUserName(String userName);
	
	

}
