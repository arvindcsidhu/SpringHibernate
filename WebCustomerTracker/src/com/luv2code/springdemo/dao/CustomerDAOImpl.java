package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Customer getCustomer(Integer id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class,id);
		
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<Customer> theQuery = 
				session.createQuery("from Customer order by lastName",
											Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(customer);
		
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class,id);
		
		session.delete(customer);
		
		return customer;
	}

	@Override
	public Customer updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
