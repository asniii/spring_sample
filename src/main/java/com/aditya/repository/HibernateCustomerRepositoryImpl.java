package com.aditya.repository;

import com.aditya.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    private String dbUsername;

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

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
