package me.niloybiswas.customer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.niloybiswas.customer.model.Customer;
import me.niloybiswas.customer.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> listAll() {
		return (List<Customer>) customerRepository.findAll();
	}
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer getCustomerById(Long id) {
		Optional<Customer> result = customerRepository.findById(id);
		return result.get();
	}
	
	public void deleteCustomerById(Long id) {
		customerRepository.deleteById(id);
	}
	
	public List<Customer> search(String keyword) {
		return customerRepository.search(keyword);
	}
	
}
