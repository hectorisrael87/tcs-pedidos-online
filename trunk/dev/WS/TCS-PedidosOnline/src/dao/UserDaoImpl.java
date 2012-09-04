package dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import model.User;



@Repository("userDao")
public class UserDaoImpl implements UserDao {

	//@Autowired
	private SessionFactory sessionFactory;

	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> listUsers() {
		return (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class).list();
	}

	
	public User User(String username, String password) {
		User user=new User ();
		//user=(User)sessionFactory.getCurrentSession().createQuery("FROM User U WHERE U.password = 1234 ").uniqueResult();
		user.setFirstName("Ezequiel");
		user.setLastName("fonti");
		user.setUsername(username);
		user.setPassword(password);
		user.setValid(true);
		return user;
	}

}
