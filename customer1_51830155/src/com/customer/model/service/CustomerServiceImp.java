package com.customer.model.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.model.persistance.Customer;
import com.customer.model.persistance.CustomerDao;



@Service
@Transactional
public class CustomerServiceImp implements CustomerService {

	
	@Autowired
	private CustomerDao dao;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return dao.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Customer book =dao.getCustomerById(customerId);
		if(book==null)
			throw new CustomerNotFoundException("book with id:"+customerId);
		return book;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return dao.updateCustomer(customer);
	}

	@Override
	public Customer removeCustomer(int customerId) {
		
		return dao.removeCustomer(customerId);
	}

}
