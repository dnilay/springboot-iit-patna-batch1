package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;
@Component("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	private List<Customer> customers=null;
	
	{
		customers=new ArrayList<Customer>();
		customers.add(new Customer(getUniqueCustomerId(),"John","Doe","john@email.com"));
		customers.add(new Customer(getUniqueCustomerId(),"Mary","Public","mary@email.com"));
		customers.add(new Customer(getUniqueCustomerId(),"Rahul","Dravid","rahul@email.com"));
		customers.add(new Customer(getUniqueCustomerId(),"Sachin","Tendulkar","sachin@email.com"));
	}
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}
	private String getUniqueCustomerId()
	{
		return UUID.randomUUID().toString();
	}

}
