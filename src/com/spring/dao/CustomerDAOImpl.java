package com.spring.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomer() {
		
		Session session = sessionFactory.getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer").getResultList();
		return customers;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer myCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(myCustomer);
																																			
	}

	@Override
	@Transactional
	public List<Customer> getCustomerSorted() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer order by lastName").getResultList();
		return customers;
		}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer cust = (Customer) session.createQuery("from Customer c where c.id="+id).uniqueResult();
		return cust;
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer cust = (Customer) session.createQuery("from Customer c where c.id="+id).uniqueResult();
		session.delete(cust);
	}
	

}
