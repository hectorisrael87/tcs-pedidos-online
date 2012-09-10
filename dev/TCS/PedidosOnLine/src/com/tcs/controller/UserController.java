package com.tcs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Article;
import com.tcs.model.User;
import com.tcs.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("user") User user,
			BindingResult result) {
		return new ModelAndView("addUser");
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute(" user") User  user,
			BindingResult result) {
		 userService.addUser( user);
		return new ModelAndView("viewAdmin");
	}
	
	

	@RequestMapping(value = "/login")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (userService.login(request.getParameter("username"),request.getParameter("password")).isType() == false) {
			request.getSession().setAttribute("usuario", userService.login(request.getParameter("username"),request.getParameter("password")));
			return new ModelAndView("viewClient", "message", userService.login(request.getParameter("username"),request.getParameter("password")));

		} else {
			request.getSession().setAttribute("usuario",userService.login(request.getParameter("username"),request.getParameter("password")));
			return new ModelAndView("viewAdmin", "message", userService.login(request.getParameter("username"),request.getParameter("password")));

		}

	}

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:index.jsp";
	}
}
