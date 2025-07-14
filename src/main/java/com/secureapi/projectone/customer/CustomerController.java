package com.secureapi.projectone.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Customer> getAll() {
        return service.getAllCustomers();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Integer id) {
        return service.getCustomerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return service.createCustomer(customer);

    }
    @GetMapping("/up")
    public String healthCheck() {
        return "Customer is up";
    }
}