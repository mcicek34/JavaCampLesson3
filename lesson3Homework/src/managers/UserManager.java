package managers;

import users.Instructer;
import users.Student;
import users.User;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getName() + " Sisteme eklendi");
	}

	public double hesapla(double dersSaati) {
		return dersSaati * 12;
	}

	public void addMultiple(Student[] users) {
		for (Student student : users) {
			System.out.println(student.getName());

		}
	}

}
