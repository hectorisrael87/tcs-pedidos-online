package com.tcs.dao;

import java.util.List;

import com.tcs.model.Permission;
import com.tcs.model.User;

public interface UserDao {
	
	public User login (String username, String password);
	
	public void saveUser (User user);
	
	public List<Permission> listPermissions ();
	
	public Permission getPermission (int ID);

}
