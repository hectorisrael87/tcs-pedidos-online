package com.tcs.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Order;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveOrder(Order order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);
		
	}

}
