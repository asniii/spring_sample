package com.aditya.repository;

import com.aditya.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("dbUsername")
    private String dbUsername;

    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList();
        Customer customer = new Customer();
        customer.setFirstname("aditya");
        customer.setLastname("nehra");
        customers.add(customer);
        System.out.println("dbusername is " + dbUsername);
        return customers;
    }
}
