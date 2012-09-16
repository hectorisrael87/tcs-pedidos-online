package com.tcs.dao;

import java.util.List;

import com.tcs.model.Order;
import com.tcs.model.User;

public interface OrderDao {

	public void saveOrder(Order Order);

	public List<Order> listOrders();

	public List<Order> listOrdersByClient(User user);

}
