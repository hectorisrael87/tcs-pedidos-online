package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.UserService;
import service.UserServiceImpl;

@Controller
public class UserController {

	// @Autowired
	UserService userService = new UserServiceImpl();

	@RequestMapping("/login")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		User user = new User();
		user = userService.validUser(request.getParameter("username"),
				request.getParameter("password"));
		if (user != null) {
			String mensaje = "Hola " + user.getFirstName() + " "
					+ user.getLastName() + " su usario es: "
					+ user.getUsername() + " y su password es "
					+ user.getPassword();
			return new ModelAndView("userLogged", "message", user);
		} else {
			String mensaje = "El usuario ingresado no es valido ";
			return new ModelAndView("userLogged", "message", user);
		}

	}
	


	/*
	 * @RequestMapping(value = "/save", method = RequestMethod.POST) public
	 * ModelAndView saveUser(@ModelAttribute(" user") User user, BindingResult
	 * result) { userService.addUser( user); return new
	 * ModelAndView("redirect:/users.html"); }
	 * 
	 * @RequestMapping(method = RequestMethod.GET) public ModelAndView
	 * listUsers() { Map<String, Object> model = new HashMap<String, Object>();
	 * model.put("users", userService.listUsers());
	 * 
	 * return new ModelAndView("UsersList", model); }
	 * 
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public
	 * ModelAndView addUser(@ModelAttribute("user") User user, BindingResult
	 * result) { return new ModelAndView("addUser");
	 * 
	 * 
	 * }
	 */

}