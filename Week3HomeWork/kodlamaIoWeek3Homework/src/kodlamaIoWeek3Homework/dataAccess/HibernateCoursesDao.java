package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Courses;

public class HibernateCoursesDao implements CoursesDao{
	ArrayList<Courses> courseArrayList = new ArrayList<>();

	@Override
	public void add(Courses courses) {
		System.out.println(courses.getName() + " --> Hibernate ile veritabanına eklendi.");
		courseArrayList.add(courses);
		}

	@Override
	public ArrayList<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return courseArrayList;
	}

}
