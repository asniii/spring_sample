package com.aditya.repository;

import com.aditya.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
