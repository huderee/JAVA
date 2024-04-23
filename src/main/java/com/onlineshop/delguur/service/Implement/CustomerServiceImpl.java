package com.onlineshop.delguur.service.Implement;

import com.onlineshop.delguur.model.entity.Customer;
import com.onlineshop.delguur.repository.CustomerRepository;
import com.onlineshop.delguur.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findByCustomerAddress(String name) {

        return customerRepository.findByAddress(name);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> createCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {

        Customer findCustomer = customerRepository.findById(customer.getId()).orElse(null);

        findCustomer.setName(customer.getName());
        findCustomer.setEmail(customer.getEmail());
        findCustomer.setPhone(customer.getPhone());
        findCustomer.setAddress(customer.getAddress());
        findCustomer.setCityRegion(customer.getCityRegion());
        findCustomer.setCcNumber(customer.getCcNumber());
        return customerRepository.save(findCustomer);
    }

    @Override
    public String deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
        return id + " id-тай хэрэглэгч устлаа.";
    }
}
