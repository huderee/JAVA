package com.onlineshop.delguur.service;

import com.onlineshop.delguur.model.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> findByCustomerAddress(String name);

    List<Customer> getAllCustomers();

//    Нэг хэрэглэгчийн мэдээлэл хадгалах
    Customer createCustomer(Customer customer);

//    Олон хэрэглэгчийн мэдээлэл хадгалах
    List<Customer> createCustomers(List<Customer> customers);
//    Нэг хэрэглэгчийн мэдээлэл авах
    Optional<Customer> getCustomerById(Long id);

//    Нэг хэрэглэгчийн мэдээлэл өөрчлөх
    Customer updateCustomer(Customer customer);

//    Нэг хэрэглэгчийн мэдээлэл устгах
    String deleteCustomerById(Long id);
}
