package com.secureapi.projectone.employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Optional<Customer> getCustomerById(Integer id) {
        return repository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }
}