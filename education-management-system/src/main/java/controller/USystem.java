package controller;

import java.util.*;

import Models.Course;
import Models.Student;
import Models.Teacher;
/**
 * <p> The university system records an index of the actors relevant 
 * for a university and the interactions between them.
 * <p> Specifically it records a list of the:
 * <ul> <li> Students
 * <li> Teachers </ul>
 * @author andreiredis
 *
 */
public class USystem {
	/**
	 * Generates a starting point for the incremental Student id. Function for next value is just incrementing the number.
	 */
	private int lastStudentId = 160000;
	/**
	 * Generates a starting point for the incremental Teacher serial number.
	 */
	private int lastTeacherSerial = 1;
	private Map<Integer, Student> studentMap;
	private Map<Integer, Teacher> teacherMap;
	private Map<String, Course> courseMap;
	/**
	 * Constructor for University system. Initializes the data 
	 * <ui>
	 */
	public USystem() {
		studentMap = new HashMap<Integer, Student>();
		teacherMap = new HashMap<Integer, Teacher>();
		courseMap = new HashMap<String, Course>();
	}
	/**
	 * Check whether Student belongs to university system.
	 * @param student
	 * @return True if belongs else false.
	 */
	public boolean isStudentRegistered(Student student) {
		return studentMap.containsValue(student);
	}
	/**
	 * Check whether Teacher belongs to university system.
	 * @param teacher
	 * @return True if belongs else false.
	 */
	public Object isTeacherRegistered(Teacher teacher) {
		return teacherMap.containsValue(teacher);
	}
	/**
	 * Adds a student in the student Map, other actions associated with registration are:
	 * <ul><li> The creation of an incremental student id
	 * <li> The creation of an email based on student id
	 * @param s1 a student
	 */
	public void register(Student s1) {
		/**
		 *  Creates an incremental student id.
		 */
		s1.setStudentId(lastStudentId);
		/**
		 *  Creates a student email based on student id
		 */
		s1.setEmail("s"+lastStudentId+"@student.dtu.dk");
		/**
		 * The function by which you create the student id in our case iss just f(x) = x + 1
		 */
		lastStudentId++;
		studentMap.put(lastStudentId, s1);
	}
	/**
	 * Adds a teacher in the teacher Map, other actions associated with registration are:
	 * <ul><li> The creation of an incremental serial number
	 * <li> The creation of an email based on first two letters of name and surname. 
	 * </ul>
	 * @param t1 a teacher
	 */
	public void register(Teacher t1) {
		/**
		 *  Creates an incremental teacher serial.
		 */
		t1.setSerial(lastTeacherSerial);
		/**
		 *  Creates a teacher email based on first two letters of name and surname.
		 */
		t1.setEmail(t1.getName().substring(0,2).toLowerCase()+t1.getSurname().substring(0,2).toLowerCase()+"@dtu.dk");
		/**
		 * The function by which you create the teacher serial in our case iss just f(x) = x + 1
		 */
		lastTeacherSerial++;
		teacherMap.put(lastTeacherSerial, t1);
	}
	/**
	 * Adds a course in the course Map, with key courseID.
	 * @param c1 a course
	 */
	public void register(Course c1) {
		courseMap.put(c1.courseId, c1);
	}
	
	public Map<String, Course> getCourseMap() {
		return courseMap;
	}
	public Map<Integer, Student> getStudentMap() {
		return studentMap;
	}
	public Map<Integer, Teacher> getTeacherMap() {
		return teacherMap;
	}

	
	
}
