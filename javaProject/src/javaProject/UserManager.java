package javaProject;

public class UserManager {

	public void Add(User user) 
	{
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullan�c� eklendi.");
	}

	public void Delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullan�c� silindi.");
	}

}
