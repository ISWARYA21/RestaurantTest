package com.testapp.service;

import java.util.List;

import com.testapp.entity.Restaurant;

public interface IRestaurantService {
	
	//Additional Functionality is Getting All the Restaurants
	public List<Restaurant> getAllRestaurant();
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public void removeRestaurant(int restid);
	public List<Restaurant> viewRestaurantByItemName(String name);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewBearByRestaurant(String location);
	

}
