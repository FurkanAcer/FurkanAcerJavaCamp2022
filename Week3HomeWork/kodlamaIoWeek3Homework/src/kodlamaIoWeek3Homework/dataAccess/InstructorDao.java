package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	
	ArrayList<Instructor> getAllInstructors();
}
