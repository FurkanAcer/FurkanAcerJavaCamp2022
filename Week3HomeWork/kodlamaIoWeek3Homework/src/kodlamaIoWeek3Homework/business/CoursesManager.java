package kodlamaIoWeek3Homework.business;

import kodlamaIoWeek3Homework.dataAccess.CoursesDao;
import kodlamaIoWeek3Homework.entities.Courses;
import kodlamaIoWeek3Homework.logging.Logger;

public class CoursesManager {

	private CoursesDao coursesDao;
	private Logger[] loggers;

	public CoursesManager(CoursesDao coursesDao, Logger[] loggers) {
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	}

	public void add(Courses courses) throws Exception {
		for (Courses c : coursesDao.getAllCourses()) {
			if (c.getName() == courses.getName()) {
				throw new Exception("Kurs ismi aynı olamaz");
			}
		}
		for (Logger logger : loggers) {
			logger.log(courses.getName());
		}
	}

}
