package controller;

import Models.Student;
import Models.USystem;
import Models.Course;
import Models.Member;
import Models.Teacher;

public class TeacherController {

	public static void main(String[] args) {
		USystem system = new USystem();
		
		////////// B. Teacher View:
		
		///// Create a new teacher:
		// Example: Teacher t = new Teacher(String name, String surname, String level, String day, String month, String year);
		//
		// Create teachers here:
		
		Teacher t = new Teacher("Mick", "Jagger", "Associate", "20", "02", "1950");
		
		////// Register teachers into the university system like so:
		// Example: system.register(t);
		//
		// Register your teachers here:
		
		system.register(t);
		
		// Check if a teacher is registered into university (uncomment the method and insert teacher instead of t)
		if (system.isTeacherRegistered(t)) {System.out.println(t+"is registered");} else {System.out.println(t+"is not registered");}
		
	}

}
