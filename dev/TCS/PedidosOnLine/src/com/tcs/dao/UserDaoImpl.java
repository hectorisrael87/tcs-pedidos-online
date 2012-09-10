package com.tcs.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User login(String username, String password) {
		User myUser = (User)sessionFactory.getCurrentSession().createQuery("FROM User U WHERE U.username = '"+ username +"' AND  U.password = '"+ password+"'" ).uniqueResult();
		return  myUser ;
	}
	
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

}
