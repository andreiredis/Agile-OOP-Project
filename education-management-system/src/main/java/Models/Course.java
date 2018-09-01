package Models;

import java.util.ArrayList;
import Models.USystem;

/**
 * A university course
 * @author andreiredis
 * 
 */
public class Course {
	protected String title;
	public String courseId;
	protected String type;
	protected String descriptionFile;
	protected int ECTS;
	protected Teacher respTeacher;
	protected Student TA;
	protected Course prerequisiteCourse;
	public ArrayList<Student> studentList;
	
	public Course() {
	}

	public Course(String title, String courseId, String type, int ECTS) {
		this.title = title;
		this.courseId = courseId;
		this.type = type;
		this.ECTS = ECTS;
		
		studentList = new ArrayList();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescriptionFile() {
		return descriptionFile;
	}

	public void setDescriptionFile(String descriptionFile) {
		this.descriptionFile = descriptionFile;
	}

	public int getECTS() {
		return ECTS;
	}

	public void setECTS(int eCTS) {
		ECTS = eCTS;
	}

	public Teacher getRespTeacher() {
		return respTeacher;
	}

	public void setRespTeacher(Teacher respTeacher) {
		this.respTeacher = respTeacher;
	}

	public Student getTA() {
		return TA;
	}

	public void setTA(Student tA) {
		this.TA = tA;
	}
	
	public Course getPrerequisiteCourse() {
		return prerequisiteCourse;
	}

	public void setPrerequisiteCourse(USystem system, String prerequisiteCourseId) {
		this.prerequisiteCourse = system.getCourseMap().get(prerequisiteCourseId);
	}

	public boolean isEnrolled (Student s) {
		return studentList.contains(s);
	}

	public String enroll(Student student) {
		studentList.add(student);
		return "student is enrolled";
	}
		
	
}
