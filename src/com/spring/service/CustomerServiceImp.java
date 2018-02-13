package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.CustomerDAO;
import com.spring.entity.Customer;

@Service
public class CustomerServiceImp implements  CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
			return customerDAO.getCustomer();
	}

	@Override
	public void saveCustomer(Customer myCustomer) {
		customerDAO.saveCustomer(myCustomer);
	}

	@Override
	public List<Customer> getCustomerSorted() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerSorted();
		}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(id);
		
	}

}
