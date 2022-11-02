package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Instructor;

public class JdbcInstrutorDao implements InstructorDao {
	ArrayList<Instructor> instructorArrayList = new ArrayList<>();
	
	@Override
	public void add(Instructor instructor) {		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName() + " --> JDBC ile veritabanına eklendi.");
		instructorArrayList.add(instructor);
	}

	@Override
	public ArrayList<Instructor> getAllInstructors() {
		// TODO Auto-generated method stub
		return getAllInstructors();
	}

}
