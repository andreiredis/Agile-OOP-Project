import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import Models.Course;
import Models.Student;
import Models.Teacher;
import Models.USystem;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	// Initialized blank object with constructor to complete test coverage
	Student s1 = new Student("Name", "Surname", "1", "1", "2000");
	Teacher t1 = new Teacher("Name", "Surname", "A level", "1", "1", "2000");
	Course c1 = new Course("Title", "courseId", "BSc/Msc/Phd", 5);
	USystem system = new USystem();
	private String message;
	
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
	
	////////// RegisterCourse.feature //////////
	
	@Given("^a student with student id (\\d+)$")
	public void a_student_with_student_id(int studId)  {
	    system.getStudentMap().get(studId);
	}

	@Given("^a teacher with theacher id (\\d+)$")
	public void a_teacher_with_theacher_id(int teachSerial) throws Throwable {
	    system.getTeacherMap().get(teachSerial);
	}

	@Given("^A course with title \"([^\"]*)\" and course id \"([^\"]*)\" and type \"([^\"]*)\" and ECTS (\\d+)$")
	public void a_course_with_title_and_course_id_and_type_and_ECTS(String title, String courseId, String type, int ECTS) throws Throwable {
		c1.setTitle(title);
	    c1.setCourseId(courseId);
	    c1.setType(type);
	    c1.setECTS(ECTS);
	}
	
	@Given("^a responsible teacher with id (\\d+) and a teaching assistant with id (\\d+) and prerequisite course with id \"([^\"]*)\"$")
	public void a_responsible_teacher_with_id_and_a_teaching_assistant_with_id_and_prerequisite_course_with_id(int teacherSerial, int studentId, String courseId) {
		c1.setRespTeacher(system.getTeacherMap().get(teacherSerial));
		c1.setTA(system.getStudentMap().get(studentId));
	    c1.setPrerequisite(system.getCourseMap().get(courseId));
	}
	
	@When("^course registration$")
	public void course_registration() throws Throwable {
	    system.register(c1);
	}
	
	@Then("^course has title \"([^\"]*)\" and course id \"([^\"]*)\" and type \"([^\"]*)\" and ECTS (\\d+)$")
	public void course_has_title_and_course_id_and_type_and_ECTS(String title, String courseId, String type, int ECTS) {
		assertEquals(c1.getTitle(), title);
		assertEquals(c1.getCourseId(),courseId);
		assertEquals(c1.getType(),type);
		assertEquals(c1.getECTS(),ECTS);
	}
	
	@Then("^has a responsible teacher with id (\\d+) and a teaching assistant with id (\\d+) and prerequisite course with id \"([^\"]*)\"$")
	public void has_a_responsible_teacher_with_id_and_a_teaching_assistant_with_id_and_prerequisite_course_with_id(int teacherSerial, int studentId, String courseId) throws Throwable {
		assertEquals(c1.getRespTeacher(), system.getTeacherMap().get(teacherSerial));
		assertEquals(c1.getTA(),system.getStudentMap().get(studentId));
		assertEquals(c1.getPrerequisite(), system.getCourseMap().get(courseId));
	}
	
	/////////// Enroll Student feature
	
	@Given("^student with id (\\d+) is false enrolled in course \"([^\"]*)\"$")
	public void student_with_id_is_false_enrolled_in_course(int studentId, String courseId) throws Throwable {
	    assertFalse(system.getCourseMap().get(courseId).isEnrolled(system.getStudentMap().get(studentId)));
	}

	@Given("^student (\\d+) is true enrolled in course \"([^\"]*)\"$")
	public void student_is_true_enrolled_in_course(int studentId, String courseId) throws Throwable {
		assertTrue(system.getCourseMap().get(courseId).isEnrolled(system.getStudentMap().get(studentId)));
	}

	@When("^enroll (\\d+) in \"([^\"]*)\"$")
	public void enroll_in(int studentId, String courseId)  {
		message = system.getCourseMap().get(courseId).enroll(system.getStudentMap().get(studentId));
	}

	@Then("^display \"([^\"]*)\"$")
	public void display(String test) {
	    assertEquals(message, test);
	}

	@Given("^student (\\d+) is false enrolled in course \"([^\"]*)\"$")
	public void student_is_false_enrolled_in_course(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
