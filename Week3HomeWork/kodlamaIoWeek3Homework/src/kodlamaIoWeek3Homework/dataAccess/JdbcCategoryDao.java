package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile Category veritabanı eklendi");			
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return getAllCategories();
	}

}
