package javaProject;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setFirstName("Muhammed");
		user1.setLastName("�nan");
		
		Student student = new Student();
		student.setFirstName("Mehmet");
		student.setLastName("Kaya");
		student.setStudentNumber("123456");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�"); 
		instructor.setEmail("engin@hotmail.com");
		instructor.setPassword("123456abc");
		instructor.setCourseName("Nitelikli yaz�l�m geli�tirici kamp�");
		
		UserManager userManager = new UserManager();
		userManager.Add(user1);
		userManager.Delete(user1); 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Delete(instructor);
		instructorManager.BestInstructor(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		studentManager.Delete(student);      
		

	}

}
