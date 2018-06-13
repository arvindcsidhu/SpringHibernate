package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	

	Customer getCustomer(Integer id);
	
	List<Customer> getCustomers();
	
	Customer saveCustomer(Customer customer);
	
	Customer deleteCustomer(int id);
	
	Customer updateCustomer();

}
