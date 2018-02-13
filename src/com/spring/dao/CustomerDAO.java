package com.spring.dao;
import java.util.List;

import com.spring.entity.*;
 
public interface CustomerDAO {

	public List<Customer> getCustomer();

	public void saveCustomer(Customer myCustomer);

	public List<Customer> getCustomerSorted();

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
