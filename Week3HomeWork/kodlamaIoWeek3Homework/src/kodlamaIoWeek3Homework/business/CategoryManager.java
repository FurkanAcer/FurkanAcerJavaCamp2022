package kodlamaIoWeek3Homework.business;

import kodlamaIoWeek3Homework.dataAccess.CategoryDao;
import kodlamaIoWeek3Homework.entities.Category;
import kodlamaIoWeek3Homework.logging.Logger;

public class CategoryManager {
	private CategoryDao categorydao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categorydao, Logger[] loggers) {
		this.categorydao = categorydao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		for (Category c : categorydao.getAllCategories()) {
			if(c.getName() == category.getName()) {
				throw new Exception("Kategori ismi aynı olamaz");
			}
		}
		for (Logger logger : loggers) 
		{
			logger.log(category.getName());
		}
	}
	

}
