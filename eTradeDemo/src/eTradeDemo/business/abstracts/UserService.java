package eTradeDemo.business.abstracts;

import java.util.List;

import eTradeDemo.entities.concretes.User;

public interface UserService {

	void register (User user);
	void login(User user);
	List<User> getAll();
}
