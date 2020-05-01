package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// return all the Customers
		return customerDAO.getCustomers();
	}




	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		// delegate the request to CustomerDAO where actual database related things happen
		customerDAO.saveCustomer(theCustomer);
		
	}


	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// delegate the request to CustomerDAO where actual database related things happen
		// we are trying to get the customer based on id
		// so that we can pre populate to form
		return customerDAO.getCustomer(theId);
		
	}




	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// delegate the request to CustomerDAO where actual database related things happen
		// we are trying to delete the customer based on id
		customerDAO.deleteCustomer(theId);
	}

}
