package me.niloybiswas.customer.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import me.niloybiswas.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
