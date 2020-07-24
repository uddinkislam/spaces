package com.spaces.portal.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.spaces.portal.login.request.CreateUser;

public interface UserRepository extends CrudRepository<CreateUser, String> {

}
