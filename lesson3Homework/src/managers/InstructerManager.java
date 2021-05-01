package managers;

import users.Instructer;
import users.Student;

public class InstructerManager extends UserManager{

	public void add(Instructer instructer) {
		System.out.println(instructer.getName() + " Sisteme eklendi");
	}
	
	public double hesapla(double dersSaati) {
		return dersSaati * 50;
	}
	
	public void addMultiple(Instructer[] instructers) {
		for (Instructer instructer : instructers) {
			System.out.println(instructer.getName());
			
		}
		
	}
}
