package eTradeDemo.core;

import eTradeDemo.google.GoogleRegisterManager;

public class GoogleManagerAdapter implements RegisterAndLoginService {

	GoogleRegisterManager googleRegister=new GoogleRegisterManager();
	@Override
	public void registerToSystem(String email, String password) {
		googleRegister.register(email, password);
		
	}

	@Override
	public void loginToSystem(String email, String password) {
		googleRegister.login(email, password);
		
	}

}
