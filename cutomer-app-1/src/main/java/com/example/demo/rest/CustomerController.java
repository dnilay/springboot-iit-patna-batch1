package com.example.demo.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private CustomerDao customerDao;

	//constructor injection
	public CustomerController(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
	
	@GetMapping
	public List<Customer> getCustomers()
	{
		return customerDao.getAllCustomers();
	}
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer)
	{
		customer.setCustomerId(UUID.randomUUID().toString());
		 return customerDao.createCustomer(customer);
	}

}
