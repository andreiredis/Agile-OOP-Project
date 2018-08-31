
public class Student extends Member {
	private int studentId;
	
	public Student() {
		super();
	}

	public Student(String name, String surname, String day, String month, String year) {
		super(name, surname, day, month, year);
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
