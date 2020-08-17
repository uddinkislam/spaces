package com.spaces.portal.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.spaces.portal.login.data.User;

public interface IUserRepository extends CrudRepository<User, String> {
	
	public boolean existsUserByEmail(String email);
	
	public boolean existsUserByUser_Name(String userName);
	
	public User findUserByEmail(String email);

}
