package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Courses;

public class JdbcCoursesDao implements CoursesDao {

	@Override
	public void add(Courses courses) {
		System.out.println("Jdbc ile Category veritabanı eklendi");			
	}

	@Override
	public ArrayList<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return getAllCourses();
	}

}
