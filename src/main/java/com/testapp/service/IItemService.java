package com.testapp.service;

import java.util.List;

import com.testapp.entity.Category;
import com.testapp.entity.Item;
import com.testapp.entity.Restaurant;

public interface IItemService {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(Item item);
	public void removeItem(Item item);
	public List<Item> viewAllItem(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemsbyName(String name);

}
