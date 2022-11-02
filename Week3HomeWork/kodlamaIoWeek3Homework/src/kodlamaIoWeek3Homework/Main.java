package kodlamaIoWeek3Homework;

import kodlamaIoWeek3Homework.business.CategoryManager;
import kodlamaIoWeek3Homework.business.CoursesManager;
import kodlamaIoWeek3Homework.business.InstructorManager;
import kodlamaIoWeek3Homework.dataAccess.HibernateCategoryDao;
import kodlamaIoWeek3Homework.dataAccess.HibernateCoursesDao;
import kodlamaIoWeek3Homework.dataAccess.JdbcInstrutorDao;
import kodlamaIoWeek3Homework.entities.Category;
import kodlamaIoWeek3Homework.entities.Courses;
import kodlamaIoWeek3Homework.entities.Instructor;
import kodlamaIoWeek3Homework.logging.DataBaseLogger;
import kodlamaIoWeek3Homework.logging.FilelLogger;
import kodlamaIoWeek3Homework.logging.Logger;
import kodlamaIoWeek3Homework.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(0,"Programlama");
		
		Instructor instructor1 = new Instructor(0,"Engin", "Demiroğ");
	
		Courses course1 = new Courses(0,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 0, 100);
		Courses course2 = new Courses(1,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", 1, 150);
		Courses course3 = new Courses(2,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 2, 80);
		Courses course4 = new Courses(3,"Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 3, 75);
		Courses course5 = new Courses(4,"(2020) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 4, 95);
		Courses course6 = new Courses(5,"Programlamaya Giriş İçin Temel Kurs", 5,50);
	
		
		
		Logger[] loggers = {new DataBaseLogger(), new FilelLogger(), new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);     --> Kategori ismi tekrar edemez hatası alınan nokta.
		
		System.out.println("---------------------------------");
		
		CoursesManager courseManager = new CoursesManager(new HibernateCoursesDao(), loggers);
		courseManager.add(course1);
		//courseManager.add(course2);         --> Kursun fiyatı 0'dan küçük olamaz hatası alınan nokta.
		courseManager.add(course6);
		//courseManager.add(course7);         --> Kurs ismi tekrar edemez hatası alınan nokta.
		
		System.out.println("---------------------------------");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstrutorDao(), loggers);
		instructorManager.add(instructor1);
	}

}
