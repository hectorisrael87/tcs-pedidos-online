package com.tcs.service;

import java.util.List;

import com.tcs.model.Permission;
import com.tcs.model.User;

public interface UserService {
	
	public User login (String username, String password);
	
	public void addUser (User user);
	
	public List<Permission> listPermissions ();
	
	public Permission getPermission(int ID);

}
