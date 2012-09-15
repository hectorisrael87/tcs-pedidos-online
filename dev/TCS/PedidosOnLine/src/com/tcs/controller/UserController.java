package com.tcs.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Brand;
import com.tcs.model.Permission;
import com.tcs.model.User;
import com.tcs.service.UserService;

@Controller
@Scope
public class UserController {

	@Resource
	private UserService userService;
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public ModelAndView addArticle(@ModelAttribute("user") User user,@ModelAttribute("permission") Permission permission,
			BindingResult result, HttpServletRequest request) {
		request.setAttribute("permissions", userService.listPermissions());
		return new ModelAndView("addUser");
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveArticle(@ModelAttribute(" user") User  user,
			BindingResult result, HttpServletRequest request) {
		int i=Integer.valueOf(request.getParameter("permission"));
		user.setPermission(userService.getPermission(i));
		userService.addUser( user);
		return new ModelAndView("viewAdmin");
	}
	
	

	@RequestMapping(value = "/login")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (userService.login(request.getParameter("username"),request.getParameter("password")).getPermission().getPermissionType() == 1 && (userService.login(request.getParameter("username"),request.getParameter("password")).isValid()==true )) {
			request.getSession(true).setAttribute("usuario", userService.login(request.getParameter("username"),request.getParameter("password")));
			return new ModelAndView("viewClient", "message", userService.login(request.getParameter("username"),request.getParameter("password")));

		} 
		if (userService.login(request.getParameter("username"),request.getParameter("password")).getPermission().getPermissionType() == 0 && (userService.login(request.getParameter("username"),request.getParameter("password")).isValid()==true )) {
			request.getSession(true).setAttribute("usuario",userService.login(request.getParameter("username"),request.getParameter("password")));
			return new ModelAndView("viewAdmin", "message", userService.login(request.getParameter("username"),request.getParameter("password")));

		}
			return new ModelAndView("redirect:index.jsp", "message", "Usuario y/o password Invalidos");
		

	}

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:index.jsp";
	}
}
