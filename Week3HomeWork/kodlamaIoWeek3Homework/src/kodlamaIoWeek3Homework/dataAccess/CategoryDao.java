package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Category;

public interface CategoryDao {
	void add(Category category);
	
	ArrayList<Category> getAllCategories();
}
