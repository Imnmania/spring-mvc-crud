package me.niloybiswas.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import me.niloybiswas.customer.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
