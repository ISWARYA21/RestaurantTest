package com.testapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.ICategoryRepository;
import com.testapp.entity.Category;

@Service
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	private ICategoryRepository repository;

	@Override
	public Category addCategory(Category cat) {
		// TODO Auto-generated method stub
		return repository.save(cat);
	}

	@Override
	public Category updateCategory(Category cat) {
		// TODO Auto-generated method stub
		Category category =repository.findById(cat.getCatid()).orElseThrow(
				() -> new EntityNotFoundException("no Category found by the id"));
		category.setCategoryName(cat.getCategoryName());
		return repository.save(category);
	}

	@Override
	public void removeCategory(int catid) {
		Category category =repository.findById(catid).orElseThrow(
				() -> new EntityNotFoundException("no Category found by the id"));
		 repository.delete(category);
	}

	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		return (List<Category>)repository.findAll();
	}

	@Override
	public Category viewCategory(int cat) {
		Category category = repository.findById(cat).orElseThrow( () -> new EntityNotFoundException("No Category found by the id"));
		return category;
	}

}
