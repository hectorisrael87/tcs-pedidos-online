package service;

import java.util.List;

import model.User;

public interface UserService {

	/*public void addUser(User user);

	public List<User> listUsers();
	*/
	public User validUser (String username, String password);

}
