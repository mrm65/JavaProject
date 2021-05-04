package concrete;

import abstracts.UserCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(this.userCheckService.checkIfRealPerson(user)) {
		System.out.println(user.getFirstName() + " isimli kullanýcý eklendi");
		}
		else {System.out.println("Kullanýcý bulunamadý");}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcý güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "isimli kullanýcý silindi");
		
	}

}
