package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO customerDao;

	@Override
	@Transactional
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
	}

	@Override
	public Customer updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
