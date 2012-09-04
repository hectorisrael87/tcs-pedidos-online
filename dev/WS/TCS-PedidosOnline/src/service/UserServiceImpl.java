package service;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	// @Autowired

	public UserServiceImpl() {
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(User user) {
		userDao.saveUser(user);
	}

	public List<User> listUsers() {
		return userDao.listUsers();

	}

	public User validUser(String username, String password) {

		User user;
		user = userDao.User(username, password);
		return user;

	}

}
