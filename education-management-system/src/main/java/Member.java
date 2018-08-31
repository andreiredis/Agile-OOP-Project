/**
 * The abstract class is a template for all Person entities that are relevant in an University. 
 * It characterizes people with the details relevant for the university.
 * @author andreiredis
 *
 */
public abstract class Member {
	protected String name;
	protected String surname;
	protected String day;
	protected String month;
	protected String year;
	protected String email;
	
	public Member() {}
	/**
	 * Constructor that allows for quick edit of fields.
	 * @param name
	 * @param surname
	 * @param day
	 * @param month
	 * @param year
	 */
	public Member(String name, String surname, String day, String month, String year) {
		this.name = name;
		this.surname = surname;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
