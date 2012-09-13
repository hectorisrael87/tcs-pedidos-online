package com.tcs.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.dao.OrderDao;
import com.tcs.model.Order;

@Service("orderService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderDao;
	
	public void addOrder(Order order) {
		orderDao.saveOrder(order);
		
	}

	
	public List<Order> listOrders() {
		
		return null;
	}

	
	public Order getOrder(int ID) {
		
		return null;
	}

}
