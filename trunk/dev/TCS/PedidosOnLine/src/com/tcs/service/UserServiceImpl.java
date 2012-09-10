package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.dao.UserDao;
import com.tcs.model.User;


@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	
	public User login(String username, String password) {
		
		return userDao.login(username, password);
	}


	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(User user) {
		userDao.saveUser(user);
	}

}
