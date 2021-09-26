package com.testapp.service;

import java.util.List;

//import org.springframework.stereotype.Service;
import com.testapp.entity.Customer;



public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void removeCustomer(int custid);
	public Customer viewCustomer(int custid);
	public List<Customer> viewAllCustomer();
	public List<Customer> getAllCustomer();
}
