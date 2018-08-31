import java.util.*;

public class USystem {
	private int lastStudentId = 160000;
	private int lastTeacherSerial = 1;
	private Map<Integer, Student> studentMap;
	private Map<Integer, Teacher> teacherMap;
	
	public USystem() {
		studentMap = new HashMap<Integer, Student>();
		teacherMap = new HashMap<Integer, Teacher>();
	}

	public boolean isStudentRegistered(Student student) {
		return studentMap.containsValue(student);
	}
	
	public Object isTeacherRegistered(Teacher teacher) {
		return teacherMap.containsValue(teacher);
	}

	public void register(Student s1) {
		// creates an incremental student id
		s1.setStudentId(lastStudentId);
		
		// creates a student email based on student id
		s1.setEmail("s"+lastStudentId+"@student.dtu.dk");
		
		lastStudentId++;
		studentMap.put(lastStudentId, s1);
	}
	
	public void register(Teacher t1) {
		// creates an incremental student id
		t1.setSerial(lastTeacherSerial);
		
		// creates a student email based on student id
		t1.setEmail(t1.getName().substring(0,2).toLowerCase()+t1.getSurname().substring(0,2).toLowerCase()+"@dtu.dk");
		
		lastTeacherSerial++;
		teacherMap.put(lastTeacherSerial, t1);
	}

	
	
}
