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

import com.testapp.entity.Restaurant;
import com.testapp.service.RestaurantServiceImpl;

@RestController
public class RestaurantController {
	@Autowired
	RestaurantServiceImpl resService;
	
	@PostMapping("/restaurant")
	public void addRestaurant(@RequestBody Restaurant rest) {	
		resService.addRestaurant(rest);
	}
	
	  @GetMapping("/restaurant") public List<Restaurant> getAllRestaurants(){ 
		  return resService.getAllRestaurant();
	  }
	 /* 
	 * @GetMapping("/user/{userid}") public User
	 * getUserById(@PathVariable("userid")int userId) { return
	 * userService.findUserById(userId); }
	 */ 
	  @DeleteMapping("/restaurant/{restid}") public void deleteRestaurant(@PathVariable int restid) {
		  resService.removeRestaurant(restid);
	  }
	  
	  
	  @PutMapping("/restaurant") public Restaurant updateRestaurant(@RequestBody Restaurant res) { return
	  resService.updateRestaurant(res); 
	  }
	 
}
