package javaProject;

public class InstructorManager extends UserManager {
	
	@Override
	public void Add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli eðitmen eklendi.");
	}
	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli eðitmen silindi.");
	}
	
	public void BestInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ayýn eðitmeni seçildi.");
	}

}