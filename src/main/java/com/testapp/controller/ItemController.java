package com.testapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.entity.Item;
import com.testapp.service.ItemServiceImpl;

@RestController
public class ItemController {
	@Autowired
	ItemServiceImpl itemserv;
	
	@PostMapping("/item")
	public void addItem(@RequestBody Item it) {	
		itemserv.addItem(it);
	}
	
	  @GetMapping("/item/{name}") public List<Item> getAllItem(@RequestParam(value = "ItemName") String itemname){ 
		  return itemserv.viewAllItemsbyName(itemname);
	  }
	  
	  @GetMapping("/item/{itemid}") public Item getItemById(@RequestParam(value = "itemid") int itemid){ 
		  return itemserv.viewItem(itemid);
	  }
	  
		/*
		 * @GetMapping("/category/{catid}") public Category
		 * getCategorybyId(@PathVariable("catid")int catid) { return
		 * catserv.viewCategory(catid); }
		 */
	  
	  @DeleteMapping("/item/{itemid}") 
	  public void deleteItem(@PathVariable int itemid) {
		  itemserv.removeItem(itemid);
		  
	  }
	  
	  
	  @PutMapping("/item") public Item updateItem(@RequestBody Item item) { 
		  return  itemserv.updateItem(item);
	 
	  }
	 
}
