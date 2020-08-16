
package com.spaces.portal.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spaces.portal.login.repository.UserRepository;
import com.spaces.portal.login.request.CreateUser;

@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userData;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(@RequestBody CreateUser user) {
		String res;
		try {
			userData.save(user);
			res = "success! user has been created";
			
		} catch (Exception e) {
			res = "something went wrong! " + e.getMessage();
			
		}		
		return res;
		

	}

}
