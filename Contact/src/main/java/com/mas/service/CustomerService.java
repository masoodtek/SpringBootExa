package com.mas.service;

import java.util.List;

import com.mas.entity.CustomerEntity;

public interface CustomerService {
	public Boolean saveCustomerDetails(CustomerEntity customerEntity);
	public List<CustomerEntity> getAllCustomerDetails();
	public CustomerEntity editCustomerDetails(CustomerEntity entity);
	public CustomerEntity delectCustomerDetails(CustomerEntity entity);

}
