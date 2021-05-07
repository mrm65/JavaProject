package eTradeDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users= new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println("Kay�t ba�ar�l� : " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Giri� ba�ar�l� : "+ user.getFirstName() + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
