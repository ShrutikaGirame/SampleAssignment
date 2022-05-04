package com.Recipe.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Recipe.book.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
