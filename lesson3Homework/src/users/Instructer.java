package users;

public class Instructer extends User {

	private String instructerNumber;
	private String department;

	public Instructer(int id, String name, String surname, String gender, String instructerNumber, String department) {
		super(id, name, surname, gender);
		this.instructerNumber = instructerNumber;
		this.department = department;
	}

	public String getInstructerNumber() {
		return instructerNumber;
	}

	public void setInstructerNumber(String instructerNumber) {
		this.instructerNumber = instructerNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
