package com.tcs.service;

import java.util.List;
import com.tcs.model.Order;

public interface OrderService {

	public void addOrder(Order order);

	public List<Order> listOrders();

	public Order getOrder(int ID);

}
