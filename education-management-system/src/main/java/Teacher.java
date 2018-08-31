
public class Teacher extends Member {
	private String level;
	private int serial;
	
	public Teacher() {
		super();
	}

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
