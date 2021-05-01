package users;

import managers.InstructerManager;
import managers.StudentManager;
import managers.UserManager;

public class Main {

	public static void main(String[] args) {

		Student student = new Student(1, "mustafa", "�i�ek", "erkek", "160202055", "enginer");
		Instructer instructer = new Instructer(2, "Engin", "Demiro�", "erkek", "1111111", "Computer Science");
		User user = new User(3, "Ali", "�olak", "erkek");

		Student student2 = new Student(1, "ay�e", "�i�ek", "kad�n", "15020205", "lawyer");
		Instructer instructer2 = new Instructer(2, "Defne", "Korkmaz", "Kad�n", "2222222", "Lawyer");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		InstructerManager instructerManager = new InstructerManager();
		instructerManager.add(instructer);

		System.out.println("----------------------------------------------------");
		
		Student[] students = new Student[] { student, student2 };
		studentManager.addMultiple(students);
		
		System.out.println("----------------------------------------------------");
		
		Instructer[] instructers = new Instructer[] { instructer, instructer2 };
		instructerManager.addMultiple(instructers);
		
		System.out.println("----------------------------------------------------");

		UserManager[] userManagers = new UserManager[] { new UserManager(), new StudentManager(), new InstructerManager() };
		for (UserManager userManager2 : userManagers) {
			System.out.println(userManager2.hesapla(30));
		}

	}

}
