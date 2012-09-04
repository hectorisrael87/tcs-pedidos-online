package dao;

import java.util.List;
import model.User;

public interface UserDao {

	public void saveUser(User User);

	public List<User> listUsers();
	
	public User User (String username, String password);

}
