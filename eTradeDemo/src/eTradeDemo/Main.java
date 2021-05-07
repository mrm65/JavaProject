package eTradeDemo;

import eTradeDemo.business.abstracts.UserService;
import eTradeDemo.business.concretes.UserManager;
import eTradeDemo.business.concretes.ValidateManager;
import eTradeDemo.core.GoogleManagerAdapter;
import eTradeDemo.core.RegisterAndLoginService;
import eTradeDemo.dataAccess.concretes.HibernateUserDao;
import eTradeDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Muhammed","Ýnan","abc@gmail.com","123456879");
		UserService userService = new UserManager(new HibernateUserDao(), new ValidateManager());
		userService.register(user1);
		userService.register(user1);
		
		RegisterAndLoginService service = new GoogleManagerAdapter();
		service.registerToSystem("abc@gmail.com", "123466");
		service.loginToSystem("abc@gmail.com", "123466");

	}

}
