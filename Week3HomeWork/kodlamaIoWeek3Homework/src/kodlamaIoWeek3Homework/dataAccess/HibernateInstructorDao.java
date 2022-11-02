package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Instructor;

public class HibernateInstructorDao implements  InstructorDao{

	@Override
	public void add(Instructor instructor) {
		ArrayList<Instructor> instructorArrayList = new ArrayList<>();
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " --> Hibernate ile veritabanına eklendi.");
		instructorArrayList.add(instructor);		
	}

	@Override
	public ArrayList<Instructor> getAllInstructors() {
		// TODO Auto-generated method stub
		return getAllInstructors();
	}
	
}
