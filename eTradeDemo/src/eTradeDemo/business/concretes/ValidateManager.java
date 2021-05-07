package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.UserValidateService;
import eTradeDemo.entities.concretes.User;

public class ValidateManager implements UserValidateService {

	@Override
	public void validate(User user) {
		System.out.println(user.getEmail()+"  Doðrulama maili gönderildi.");
		System.out.println("Oluþturuldu.");
	}

}
