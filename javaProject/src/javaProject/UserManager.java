package javaProject;

public class UserManager {

	public void Add(User user) 
	{
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanýcý eklendi.");
	}

	public void Delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanýcý silindi.");
	}

}
