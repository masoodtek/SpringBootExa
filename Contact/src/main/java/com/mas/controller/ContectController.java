package com.mas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mas.entity.CustomerEntity;
import com.mas.service.CustomerServiceImpl;

@RestController
public class ContectController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public Boolean SaveCustomer(@RequestBody CustomerEntity customerEntity) {
		
		System.out.println(customerEntity);
		Boolean saveCustomerDetails = customerServiceImpl.saveCustomerDetails(customerEntity);
		return saveCustomerDetails;

	}
	@RequestMapping("/findall")
	public List<CustomerEntity> findAllCustomerDetails(){
		List<CustomerEntity> allCustomerDetails = customerServiceImpl.getAllCustomerDetails();
		return allCustomerDetails;
		
	}
	@RequestMapping(method = RequestMethod.POST, value = "/edit")
	public CustomerEntity editCustomerDetails(@RequestBody CustomerEntity customerEntity){
	CustomerEntity editCustomerDetails = customerServiceImpl.editCustomerDetails(customerEntity);
		return editCustomerDetails;
		
	}
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public CustomerEntity delectCustomerDetails(@RequestBody CustomerEntity customerEntity){
	CustomerEntity editCustomerDetails = customerServiceImpl.delectCustomerDetails(customerEntity);
		return editCustomerDetails;
		
	}

}
