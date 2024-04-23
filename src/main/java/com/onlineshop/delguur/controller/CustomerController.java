package com.onlineshop.delguur.controller;

import com.onlineshop.delguur.model.entity.Customer;
import com.onlineshop.delguur.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(maxAge = 3600)
public class CustomerController {
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/customers")
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/api/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @PostMapping("/api/customers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return customerService.createCustomers(customers);
    }

    @GetMapping("/api/customers/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @PutMapping("/api/customer")
    public Customer editCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/api/customer/{id}")
    public String deleteCustomerById(@PathVariable Long id){
        return customerService.deleteCustomerById(id);
    }

}
