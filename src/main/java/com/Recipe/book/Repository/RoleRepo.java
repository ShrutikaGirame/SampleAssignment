package com.Recipe.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer> {

}
