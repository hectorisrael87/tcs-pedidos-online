package com.tcs.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Brand;
import com.tcs.model.Permission;
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

	@SuppressWarnings("unchecked")
	public List<Permission> listPermissions() {
		// TODO Auto-generated method stub
		return (List<Permission>) sessionFactory.getCurrentSession().createCriteria(Permission.class).list();
	}

	@Override
	public Permission getPermission(int ID) {
		Permission permission = (Permission)sessionFactory.getCurrentSession().createQuery("FROM Permission P WHERE P.permissionId = "+ ID +"").uniqueResult();
		return  permission ;
	}

}
