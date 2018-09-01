package Models;
/**
 * Is a type of Member that participates in courses at the university.
 * @author andreiredis
 *
 */
public class Student extends Member {
	private int studentId;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", surname=" + surname + ", day=" + day
				+ ", month=" + month + ", year=" + year + ", email=" + email + "]";
	}
	public Student() {
		super();
	}
	/**
	 * Constructor using superclass Member constructor.
	 * @param name
	 * @param surname
	 * @param day
	 * @param month
	 * @param year
	 */
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
