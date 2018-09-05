package com.aditya.service;

import com.aditya.model.Customer;
import com.aditya.repository.CustomerRepositorySetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerServiceSetter")
public class CustomerServiceImplSetter implements CustomerServiceSetter {

    private CustomerRepositorySetter customerRepositorySetter;

    //This is for setter injection
    @Autowired
    public void setCustomerRepositorySetter(CustomerRepositorySetter customerRepositorySetter) {
        System.out.println("this is setter injection.");
        this.customerRepositorySetter = customerRepositorySetter;
    }
    
    @Override
    public List<Customer> findAll(){
        return customerRepositorySetter.findAll();
    }
}
