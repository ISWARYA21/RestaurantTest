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

//import com.sprintaws.entity.Category;
import com.sprintaws.entity.Customer;

import com.sprintaws.service.CustomerServiceImpl;

//import java.util.List;@RestController
@RestController
public class CustomerController {
	@Autowired
		CustomerServiceImpl custService;
		
		@PostMapping("/customer")
		public void addCustomer(@RequestBody Customer cust) {	
		custService.addCustomer(cust);
		}
		
		
		@GetMapping("/customer") 
		public List<Customer> getAllCustomers(){
			return custService.getAllCustomer();
	     }
		
		
		@GetMapping("/customer/{custid}")
		public Customer getCustomerById(@PathVariable("custid")int custid) {
			return custService.viewCustomer(custid);
		}
		
		
		@DeleteMapping("/customer/{catid}") 
		public void deleteCustomer(@PathVariable int catid) {
			  custService.removeCustomer(catid);
		 }
		  
		  
		 @PutMapping("/customer")
		 public Customer updateCustomer(@RequestBody Customer cust) { 
			  return custService.updateCustomer(cust); 
		  }
}