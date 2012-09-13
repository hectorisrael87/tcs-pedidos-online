package com.tcs.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Order;
import com.tcs.service.OrderService;


@Controller
@RequestMapping("/orders")
@Scope
public class OrderController {
	
	@Resource
	private OrderService orderService;
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addOrder(@ModelAttribute("order") Order order,
			BindingResult result) {
		return new ModelAndView("addOrder");
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveOrder(@ModelAttribute(" order") Order  order,
			BindingResult result) {
		orderService.addOrder( order);
		return new ModelAndView("redirect:/brands.html");
	}

}
