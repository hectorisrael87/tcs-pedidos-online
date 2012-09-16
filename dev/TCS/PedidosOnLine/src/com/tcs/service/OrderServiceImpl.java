package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.dao.ArticleDao;
import com.tcs.dao.OrderDao;
import com.tcs.model.Article;
import com.tcs.model.Order;
import com.tcs.model.User;


@Service("orderService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private OrderDao orderDao;
	
	public OrderServiceImpl() {
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addOrder(Order order) {
		orderDao.saveOrder(order);
	}

	public List<Order> listOrders() {
		return orderDao.listOrders();
	}
	
	public List<Order> listOrdersByClient(User user) {
		return orderDao.listOrdersByClient(user);
	}

	
}
