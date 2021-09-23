package com.testapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testapp.entity.Item;


public interface IItemRepository extends JpaRepository<Item,Integer> {
	
	@Query("SELECT u FROM Item u WHERE u.ItemName = ?1")
	List<Item> findByItemName(String name);

}
