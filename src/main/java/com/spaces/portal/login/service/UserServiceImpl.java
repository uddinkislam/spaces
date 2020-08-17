package com.spaces.portal.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaces.portal.login.data.User;
import com.spaces.portal.login.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepository userRepo;
	
	@Override
	public boolean validateUser(User user) {
		User dbUsr = userRepo.findUserByEmail(user.getEmail());
		if(dbUsr.getEmail().equalsIgnoreCase(user.getEmail()) && dbUsr.getPassword().equalsIgnoreCase(user.getPassword()) ) {			
			return true;
		} else  {
			return false;
		}
	}

	@Override
	public String saveUser(User user) {
		String res;		
		if(userExists(user.getEmail())) {
			res =  "user already exists in database";
		} else {
			try {
				userRepo.save(user);
				res = "success! user has been created";
				
			} catch (Exception e) {
				res = "something went wrong! " + e.getMessage();	
			}	
		}
		
		return res;
	}
	
	private boolean userExists(String userEmail) {
		if(userRepo.existsUserByEmail(userEmail)) {
			return true;
		} else {	
			return false;
		}
		
	}

	

}
