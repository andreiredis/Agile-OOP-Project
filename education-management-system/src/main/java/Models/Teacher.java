package Models;
/**
 * Is a type of member that has an administrative role in the managing of Course.
 * @author andreiredis
 *
 */
public class Teacher extends Member {
	@Override
	public String toString() {
		return "Teacher [level=" + level + ", serial=" + serial + ", name=" + name + ", surname=" + surname + ", day="
				+ day + ", month=" + month + ", year=" + year + ", email=" + email + "]";
	}

	private String level;
	private int serial;
	
	public Teacher() {
		super();
	}
	/**
	 * Constructor using superclass Member constructor and additional level field.
	 * @param name
	 * @param surname
	 * @param level
	 * @param day
	 * @param month
	 * @param year
	 */
	public Teacher(String name, String surname, String level, String day, String month, String year) {
		super(name, surname, day, month, year);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}
}
