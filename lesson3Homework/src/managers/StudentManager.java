package managers;

import users.Student;
import users.User;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getName() + " Sisteme eklendi");
	}
	
	public void addMultiple(Student[] student) {
		super.addMultiple(student);
	}
	
	public double hesapla(double dersSaati) {
		return dersSaati * 30;
	}
}
