package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements ICustomerService{
	
	@Autowired
	ICustomerRepository customerRepository;

	@Override
	public List<Customer> findAllCustomers() {
		//Entrega una coleccion, para que sea una lista se tiene que castear
		return (List<Customer>) customerRepository.findAll(); 
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer deleteCustomerById(Long id) {
		return null;
	}

	@Override
	public Customer findCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

}
