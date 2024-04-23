package com.onlineshop.delguur.repository;

import com.onlineshop.delguur.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByAddress(String name);
//    List<Customer> findAll();
}
