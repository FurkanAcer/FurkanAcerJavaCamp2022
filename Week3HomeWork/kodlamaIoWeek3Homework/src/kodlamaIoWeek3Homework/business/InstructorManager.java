package kodlamaIoWeek3Homework.business;


import java.util.List;

import kodlamaIoWeek3Homework.dataAccess.InstructorDao;
import kodlamaIoWeek3Homework.entities.Instructor;
import kodlamaIoWeek3Homework.logging.Logger;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	

	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}



	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
	
	public List<Instructor> getInstructors(){
		return null;
	}

}
