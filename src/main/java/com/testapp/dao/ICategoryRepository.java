package com.testapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testapp.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer>{

}
