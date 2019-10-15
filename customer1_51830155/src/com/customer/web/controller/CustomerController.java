package com.customer.web.controller;


import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customer.model.persistance.Customer;
import com.customer.model.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	

	@RequestMapping(value = "allcustomers", method = RequestMethod.GET)
	public String getCustomers(ModelMap map) {
		map.addAttribute("customers", customerService.getAllCustomers());
		return "all_customers";
	}
	// i want to procesess a book
	/*
	 * 1.u need to create a jsp page to accept the data
	 * 
	 */

	@RequestMapping(value = "addcustomer", method = RequestMethod.GET)
	public String addCustomerGEt(ModelMap map) {
		// adding an form bean
		map.addAttribute("customer", new Customer());
		return "addcustomer";
	}// adding

	/*@RequestMapping(value = "addbook", method = RequestMethod.POST)
	public String addBookPost(Book book) {
		bookService.addBook(book);
		return "redirect:allbooks";
	}// deleting
*/
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteCustomer(HttpServletRequest req) {
		int customerId = Integer.parseInt(req.getParameter("id"));
		customerService.removeCustomer(customerId);
		return "redirect:allcustomers";
	}// updating

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String updateCustomer(HttpServletRequest req, ModelMap map) {
		int customerId = Integer.parseInt(req.getParameter("id"));
		Customer customerToBeUpdated = customerService.getCustomerById(customerId);

		map.addAttribute("customer", customerToBeUpdated);
		return "addcustomer";
	}

	@RequestMapping(value = "addcustomer", method = RequestMethod.POST)
	public String addCustomerUpdatePost(@Valid Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addcustomer";

		} else {
			if (customer.getId() == 0)
				customerService.addCustomer(customer);
			else
				customerService.updateCustomer(customer);
			return"redirect:allcustomers";
		}
	}

	

	}
