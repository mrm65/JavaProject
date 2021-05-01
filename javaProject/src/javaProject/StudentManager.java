package javaProject;

public class StudentManager extends UserManager {
	@Override
	public void Add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli öðrenci eklendi.");
	}
	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli öðrenci silindi.");
	} 

}