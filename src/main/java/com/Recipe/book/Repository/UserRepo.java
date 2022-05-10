package com.Recipe.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.user;

@Repository
public interface UserRepo extends JpaRepository<user,Integer>  {

}
