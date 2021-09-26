package com.testapp.dao;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer>{

}
