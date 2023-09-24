package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@RestController
public class CustomerController {
	
	private CustomerDao customerDao;

	//constructor injection
	public CustomerController(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return customerDao.getAllCustomers();
	}

}
