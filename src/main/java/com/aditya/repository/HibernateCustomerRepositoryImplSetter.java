package com.aditya.repository;

import com.aditya.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepositorySetter")
public class HibernateCustomerRepositoryImplSetter implements CustomerRepositorySetter {
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("aditya");
        customer.setLastname("nehra");
        customers.add(customer);
        return customers;
    }
}
