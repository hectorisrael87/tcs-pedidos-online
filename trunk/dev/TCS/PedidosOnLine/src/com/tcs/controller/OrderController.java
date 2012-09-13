package com.tcs.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Order;
import com.tcs.model.User;
import com.tcs.service.OrderService;
import com.tcs.service.UserService;


@Controller
@RequestMapping("/orders")
@Scope
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveOrder(@ModelAttribute(" order") Order  order,
			BindingResult result) {
		orderService.addOrder( order);
		return new ModelAndView("redirect:/viewClient.html");
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addOrder(@ModelAttribute("order") Order order,
			BindingResult result) {
		return new ModelAndView("addOrder");
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public ModelAndView listOrders() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("orders",  orderService.listOrders());

		return new ModelAndView("ordersList", model);
	}
	
	@RequestMapping(value = "/byClient", method = RequestMethod.GET)
	public ModelAndView listOrdersByClient(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("orders",  orderService.listOrdersByClient(((User) request.getSession().getAttribute("usuario"))));

		return new ModelAndView("ordersListByClient", model);
	}

}
