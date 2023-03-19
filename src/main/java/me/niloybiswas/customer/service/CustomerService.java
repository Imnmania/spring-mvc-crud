package me.niloybiswas.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import me.niloybiswas.customer.model.Customer;
import me.niloybiswas.customer.repository.CustomerRepository;

@Service
@EnableJpaRepositories(basePackages = {"me.niloybiswas"})
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> listAll() {
		return (List<Customer>) customerRepository.findAll();
	}
	
}
