package com.testapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.ICustomerRepository;

import com.testapp.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

@Autowired
private ICustomerRepository customerRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		Customer customer = customerRepository.findById(cust.getCustomerId()).orElseThrow(
				()-> new EntityNotFoundException("No customer found by the id"));
		customer.setFirstName(cust.getFirstName());
		customer.setLastName(cust.getLastName());
		customer.setAge(cust.getAge());
		customer.setGender(cust.getGender());
		customer.setMobileNumber(cust.getMobileNumber());
		customer.setAddress(cust.getAddress());
		customer.setEmail(cust.getEmail());
		
		return customerRepository.save(customer);
	}
	
	

	@Override
	public void removeCustomer(int custid) {
		Customer customer = customerRepository.findById(custid).orElseThrow(
				()-> new EntityNotFoundException(" No customer found"));
		customerRepository.delete(customer);
		
	}

	
	@Override
	public Customer viewCustomer(int custid) {
		Customer customer = customerRepository.findById(custid).orElseThrow(
				()-> new EntityNotFoundException("No customer are found"));
		return customer;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		return (List<Customer>)customerRepository.findAll();
	}


	@Override
	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerRepository.findAll();
	}

	
}
