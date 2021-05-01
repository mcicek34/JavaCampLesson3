package users;

public class Student extends User {

	private String studentNumber;
	private String branch;

	public Student(int id, String name, String surname, String gender, String studentNumber, String branch) {
		super(id, name, surname, gender);
		this.studentNumber = studentNumber;
		this.branch = branch;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
