package com.tcs.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.model.Order;
import com.tcs.model.User;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrder(Order order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);
		
	}

	@SuppressWarnings("unchecked")
	public List<Order> listOrders() {
		
		return (List<Order>) sessionFactory.getCurrentSession().createCriteria("").list(); //falta crear la consulta
	}

	@SuppressWarnings("unchecked")
	public List<Order> listOrdersByClient(User user) {
		
		return null;
	}

}
