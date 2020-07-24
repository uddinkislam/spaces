
package com.spaces.portal.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaces.portal.login.repository.UserRepository;
import com.spaces.portal.login.request.CreateUser;
import com.spaces.portal.login.response.LoginResponse;

@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userData;
	private String name;

	@RequestMapping("/createUser")
	public String createUser(@RequestBody CreateUser user) {
		

		userData.save(user);

		return "success";

	}

}
