package com.spring.service;

import java.util.List;

import com.spring.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomer();

	public void saveCustomer(Customer myCustomer);

	public List<Customer> getCustomerSorted();

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
