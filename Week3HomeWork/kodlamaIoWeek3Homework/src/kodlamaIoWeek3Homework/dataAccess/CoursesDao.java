package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Courses;

public interface CoursesDao {
	void add(Courses courses);
	
	ArrayList<Courses> getAllCourses();
}
