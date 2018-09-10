package com.aditya.service;

import com.aditya.model.Customer;
import com.aditya.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    // For member injection.
    //@Autowired
    private CustomerRepository customerRepository ;

    public CustomerServiceImpl() {
    }

    // For constructor injection
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("We are using constructor injection.");
        this.customerRepository = customerRepository;
    }

    //For setter injection
    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository){
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> finalAll(){
        return customerRepository.findAll();
    }
}
