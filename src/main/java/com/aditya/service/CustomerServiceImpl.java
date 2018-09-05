package com.aditya.service;

import com.aditya.model.Customer;
import com.aditya.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //This is member variable autowire.
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> finalAll(){
        return customerRepository.findAll();
    }
}
