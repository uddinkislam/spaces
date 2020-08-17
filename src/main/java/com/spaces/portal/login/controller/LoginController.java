
package com.spaces.portal.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spaces.portal.login.data.User;
import com.spaces.portal.login.service.IUserService;

@RestController
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/validateUser", method = RequestMethod.POST)
	public boolean validateUser(@RequestBody User user) {
		return userService.validateUser(user);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

}
