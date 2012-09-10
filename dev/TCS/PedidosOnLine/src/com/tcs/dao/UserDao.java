package com.tcs.dao;

import com.tcs.model.User;

public interface UserDao {
	
	public User login (String username, String password);
	
	public void saveUser (User user);

}
