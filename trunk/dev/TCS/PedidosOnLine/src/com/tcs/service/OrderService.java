package com.tcs.service;

import java.util.List;

import com.tcs.model.Order;
import com.tcs.model.User;


public interface OrderService {
	
	public void addOrder(Order order);

	public List<Order> listOrders();
	
	public List<Order> listOrdersByClient(User user);

}
