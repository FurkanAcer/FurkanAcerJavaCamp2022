package kodlamaIoWeek3Homework.dataAccess;

import java.util.ArrayList;

import kodlamaIoWeek3Homework.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
ArrayList<Category> categoryArrayList = new ArrayList<>();

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " --> Hibernate ile veritabanına eklendi.");
		categoryArrayList.add(category);
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		return categoryArrayList;
	}

}
