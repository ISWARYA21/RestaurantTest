package com.testapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.testapp.entity.Restaurant;

public interface IRestaurantRepository extends JpaRepository<Restaurant,Integer> {

}
