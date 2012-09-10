package com.tcs.service;

import com.tcs.model.User;

public interface UserService {
	
	public User login (String username, String password);
	
	public void addUser (User user);

}
