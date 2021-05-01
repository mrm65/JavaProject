package javaProject;

public class InstructorManager extends UserManager {
	
	@Override
	public void Add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli e�itmen eklendi.");
	}
	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli e�itmen silindi.");
	}
	
	public void BestInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ay�n e�itmeni se�ildi.");
	}

}