package com.testapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.entity.Category;
import com.testapp.service.CategoryServiceImpl;

@RestController
public class CategoryController {
	@Autowired
	CategoryServiceImpl catserv;
	
	@PostMapping("/category")
	public void addCategory(@RequestBody Category cat) {	
		catserv.addCategory(cat);
	}
	
	  @GetMapping("/category") public List<Category> getAllCategory(){ 
		  return catserv.viewAllCategory();
	  }
	  
	  @GetMapping("/category/{catid}") 
	  public Category getCategorybyId(@PathVariable("catid")int catid) { 
		  return catserv.viewCategory(catid);
	   }
	  
	  @DeleteMapping("/category/{catid}") 
	  public void deleteCategory(@PathVariable int catid) {
		  catserv.removeCategory(catid);
		  
	  }
	  
	  
	  @PutMapping("/category") public Category updateCategory(@RequestBody Category cat) { 
		  return  catserv.updateCategory(cat);
	 
	  }
	 
}
