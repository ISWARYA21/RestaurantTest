package com.testapp.service;

import java.util.List;

import com.testapp.entity.Category;

public interface ICategoryService {
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public void removeCategory(int catid);
	public Category viewCategory(int cat);
	public List<Category> viewAllCategory();

}
