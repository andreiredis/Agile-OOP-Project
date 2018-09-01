package controller;

import Models.Student;
import Models.USystem;
import Models.Course;
import Models.Member;
import Models.Teacher;

public class StudentController {
	
	public static void StudentController() {
		
		USystem system = new USystem();
		
		////////// A. Student View:
		
		///// Create a new student:
		// Example: Student s = new Student(String name, String surname, String day, String month, String year);
		//
		// Create students here:
		
		Student s = new Student("Mick", "Jagger", "20", "02", "1950");
		
		////// Register students into the university system like so:
		// Example: system.register(s);
		//
		// Register your students here:
		
		system.register(s);
		
		// Check if a student is registered into university (uncomment the method and insert student)
		if (system.isStudentRegistered(s)) {System.out.println(s+"is registered");} else {System.out.println(s+"is not registered");}
		
	}
}
