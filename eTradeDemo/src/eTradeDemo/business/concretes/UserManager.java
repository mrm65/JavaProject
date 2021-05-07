package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.UserService;
import java.util.List;
import eTradeDemo.business.abstracts.UserValidateService;
import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserValidateService userValidateService;
	

	public UserManager(UserDao userDao, UserValidateService userValidateService) {
		super();
		this.userDao = userDao;
		this.userValidateService = userValidateService;
	}

	@Override
	public void register(User user) {
		if (isInfoNull(user)) {
			if (user.getPassword().length() >= 6 && emailCheck(user) == true && checkNameAndLastname(user) == true) {
				System.out.println(user.getFirstName() + " , kayýt olusturma  baþarýlý. +");

				userDao.register(user);
				userValidateService.validate(user);
			} else {
				System.out.println(" ! Kayýt olma baþarýsýz : " + user.getFirstName()
						+ " , Lütfen aþaðýdaki þartlarý saðlayýnýz.  " + "\n1-Sifreniz en az 6 karakter olmalýdýr "
						+ "\n2-Email daha once kullanýlmýþ olabilir "
						+ "\n3-Adýnýz ve Soyadýnýz en az 2 karakter olmalýdýr.");
			}
		} else {
			System.out.println("Lütfen bilgileri bos býrakmayýnýz!");
		}

	}

	@Override
	public void login(User user) {
		if (user.getEmail() != null && user.getPassword() != null) {
			System.out.println("Giris baþarýlý: " + user.getFirstName());
		} else {
			System.out.println("Email yada parola eksik.");
		}

	}
	
	@Override
	public List<User> getAll() {
	
		return userDao.getAll();
	}

	private boolean checkNameAndLastname(User user) {
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isInfoNull(User user) {
		if (user.getFirstName() != "" && user.getLastName() != "" && user.getEmail() != ""
				&& user.getPassword() != "") {
			return true;
		} else {
			return false;
		}
	}

	private boolean emailCheck(User user) {
		if (user.getEmail().matches(".*@.*") == true) {
			return isThereMail(user);
		} else {
			return false;
		}
	}

	private boolean isThereMail(User user) {
		for (var onDataUser : userDao.getAll()) {
			if (onDataUser.getEmail() == user.getEmail()) {
				return false;
			}
		}
		return true;
	}

	

}
