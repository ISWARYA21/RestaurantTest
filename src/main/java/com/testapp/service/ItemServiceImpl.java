package com.testapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.IItemRepository;
import com.testapp.entity.Category;
import com.testapp.entity.Item;
import com.testapp.entity.Restaurant;

@Service
public class ItemServiceImpl implements IItemService {
	
	@Autowired
	IItemRepository repository;
	

	@Override
	public Item addItem(Item item) {
		return repository.save(item);
		
	}

	@Override
	public Item updateItem(Item item) {
		Item item1 =repository.findById(item.getItemid()).orElseThrow(
				() -> new EntityNotFoundException("no Restaurant found by the id"));
		item1.setCategory(item.getCategory());
		item1.setCost(item.getCost());
		item1.setItemName(item.getItemName());
		item1.setQuantity(item.getQuantity());
		return repository.save(item1);
	}


	@Override
	public void removeItem(int id) {
		Item item = repository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("No Restaurants found"));
		repository.delete(item);

	}
	
	@Override
	public List<Item> viewAllItemsbyName(String name) {
		return repository.findByItemName(name);
	}

	@Override
	public Item viewItem(int id) {
		Item item1 = repository.findById(id).orElseThrow( () -> new EntityNotFoundException("No Item found by the id"));
		return item1;
	}

	@Override
	public List<Item> viewAllItem(Category cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> viewAllItems(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}


}
