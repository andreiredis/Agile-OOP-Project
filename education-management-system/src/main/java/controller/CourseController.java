package controller;

import Models.Student;
import Models.USystem;
import Models.Course;
import Models.Member;
import Models.Teacher;

public class CourseController {

	public static void main(String[] args) {
		USystem system = new USystem();
		Student s = new Student("Mick", "Jagger", "20", "02", "1950");
		
		
		////////// C. Course View:
		
		///// Create a new course:
		// Example: Course c = new Course(String title, String courseId, String type, int ECTS);
		//
		// Create courses here:
		
		Course c = new Course("Math", "M-101", "Phd", 20);
		Course c1 = new Course("Physics", "PY-101", "Msc", 10);
		Course c2 = new Course("Management", "MA-101", "Bsc", 5);
		
		////// Register courses into the university system like so:
		// Example: system.register(c);
		//
		// Register your courses here:
		
		system.register(c);
		
		// Add prerequisite course c1 to course c:
		c.setPrerequisiteCourseId(c1);
		
		////// Enroll student in course if it has prerequisite
		
		//		if (c2.enroll(s) == "student is enrolled") {System.out.println("Enrollment success");} else {System.out.println("Enrollment not successful");}
		
	}

}
