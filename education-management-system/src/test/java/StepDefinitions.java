import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	// Initialized blank object with constructor to complete test coverage
	Student s1 = new Student("Lorem", "Ipsum", "1", "1", "2000");
	Teacher t1 = new Teacher("Lorem", "Ipsum", "A level", "1", "1", "2000");
	USystem system = new USystem();
	
	/////////// RegisterStudent.feature //////////
	@Given("^student with name \"([^\"]*)\" and surname \"([^\"]*)\" and day \"([^\"]*)\" and month \"([^\"]*)\" and year \"([^\"]*)\"$")
	public void student_with_name_and_surname_and_day_and_month_and_year(String name, String surname, String day, String month, String year)  {
		s1.setName(name);
		s1.setSurname(surname);
		s1.setDay(day);
		s1.setMonth(month);
		s1.setYear(year);
	}
	@Given("^student (true|false) registered in the university system$")
	public void student_false_registered_in_the_university_system (boolean isRegistered) {
		assertEquals(system.isStudentRegistered(s1), isRegistered);
	} 
	@When("^student registration$")
	public void student_registration() {
	    system.register(s1);
	}
	@Then("^student has student id (\\d+)$")
	public void student_has_student_id(int studentId) {
	    assertEquals(s1.getStudentId(), studentId);
	}
	@Then("^student has email \"([^\"]*)\"$")
	public void student_has_email(String email) {
	    assertEquals(s1.getEmail(), email);
	}
	
	////////// RegisterTeacher.feature //////////
	
	@Given("^teacher with name \"([^\"]*)\" and surname \"([^\"]*)\" and day \"([^\"]*)\" and month \"([^\"]*)\" and year \"([^\"]*)\"$")
	public void teacher_with_name_and_surname_and_day_and_month_and_year(String name, String surname, String day, String month, String year)  {
		t1.setName(name);
		t1.setSurname(surname);
		t1.setDay(day);
		t1.setMonth(month);
		t1.setYear(year);
	}
	@Given("^teacher has level \"([^\"]*)\"$")
	public void teacher_has_level(String level) throws Throwable {
	    t1.setLevel(level);
	}
	@Given("^teacher (true|false) registered in the university system$")
	public void teacher_false_registered_in_the_university_system(boolean isRegistered) {
	    assertEquals(system.isTeacherRegistered(t1), isRegistered);
	}
	@When("^teacher registration$")
	public void teacher_registration() throws Throwable {
	    system.register(t1);
	}
	@Then("^teacher has serial number (\\d+)$")
	public void teacher_has_serial_number(int serialNumber)  {
	    assertEquals(t1.getSerial(), serialNumber);
	}
	@Then("^teacher has email \"([^\"]*)\"$")
	public void teacher_has_email(String email) throws Throwable {
		assertEquals(t1.getEmail(), email);
	}
}
