package com.testapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.IRestaurantRepository;
import com.testapp.entity.Address;
import com.testapp.entity.Restaurant;

@Service
public class RestaurantServiceImpl implements IRestaurantService{
	 @Autowired
	    private IRestaurantRepository repository;

	@Override
	public Restaurant addRestaurant(Restaurant res) {
		return repository.save(res);
	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		Restaurant restaurant =repository.findById(res.getRestaurantid()).orElseThrow(
				() -> new EntityNotFoundException("no Restaurant found by the id"));
		restaurant.setRestaurantname(res.getRestaurantname());
		restaurant.setAddress(res.getAddress());
		restaurant.setContactNumber(res.getContactNumber());
		restaurant.setManagerName(res.getManagerName());
		return repository.save(restaurant);
	}

	@Override
	public void removeRestaurant(int restid) {
		Restaurant restaurant = repository.findById(restid).orElseThrow(
				() -> new EntityNotFoundException("No Restaurants found"));
		repository.delete(restaurant);
		
	}
	
	@Override
	public List<Restaurant> getAllRestaurant() {
		// TODO Auto-generated method stub
		return (List<Restaurant>)repository.findAll();
	}

	//Still Have to Work on these Parts
	
	@Override
	public List<Restaurant> viewRestaurantByItemName(String name) {
	//	Restaurant restaurant = repository.
		return (List<Restaurant>)repository.findAll();
	}

	@Override
	public Restaurant viewRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> viewBearByRestaurant(String location) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
