package com.mas.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.entity.CustomerEntity;
import com.mas.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Boolean saveCustomerDetails(CustomerEntity customerEntity) {
		Date date = new Date();
		customerEntity.setCreated_Date(date);
		customerEntity.setUpdate_Date(date);
		customerEntity.setActive_Falg('n');
		customerEntity.setCreated_By("masood");
		customerEntity.setUpdate_By("masood");
		CustomerEntity save = customerRepository.save(customerEntity);
		return save!=null;
	}

	@Override
	public List<CustomerEntity> getAllCustomerDetails() {
		Character cha ='y';
		List<CustomerEntity> findByActive_Falg = customerRepository.findByActive_Falg(cha);
		System.out.println(findByActive_Falg);
		return findByActive_Falg;
	}

	@Override
	public CustomerEntity editCustomerDetails(CustomerEntity customerEntity ) {
		Date date = new Date();
		customerEntity.setCreated_Date(date);
		customerEntity.setUpdate_Date(date);
		customerEntity.setActive_Falg('y');
		customerEntity.setCreated_By("masood");
		customerEntity.setUpdate_By("masood");
		CustomerEntity save = customerRepository.save(customerEntity);
		return save;
	}

	public CustomerEntity delectCustomerDetails(CustomerEntity customerEntity) {
		customerEntity.setActive_Falg('n');
		CustomerEntity delect = customerRepository.save(customerEntity);
		return delect;
	}

}
