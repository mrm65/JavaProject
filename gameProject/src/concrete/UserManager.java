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
		System.out.println(user.getFirstName() + " isimli kullan�c� eklendi");
		}
		else {System.out.println("Kullan�c� bulunamad�");}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� g�ncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "isimli kullan�c� silindi");
		
	}

}
