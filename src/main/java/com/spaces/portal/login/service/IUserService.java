package com.spaces.portal.login.service;

import com.spaces.portal.login.data.User;

public interface IUserService {
	
	public String saveUser(User user);
	
	public boolean validateUser(User user);

}
