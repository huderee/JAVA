package com.onlineshop.delguur;

import com.onlineshop.delguur.model.entity.Customer;
import com.onlineshop.delguur.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private CustomerService customerService;

    public CommandLineRunnerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Customer> customers = customerService.findByCustomerAddress("Говь-Алтай");

        for (Customer customer: customers){
            System.out.println("Нэр: "+ customer.getName() + "\nУтас: " + customer.getPhone() + "\nХаяг: " + customer.getAddress());
        }
    }
}
