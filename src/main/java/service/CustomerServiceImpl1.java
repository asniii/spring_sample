package service;

import model.Customer;
import repository.CustomerRepository1;

import java.util.List;

public class CustomerServiceImpl1 implements CustomerService1 {
    private CustomerRepository1 customerRepository1;

    public CustomerServiceImpl1(CustomerRepository1 customerRepository1) {
        System.out.println("This will print will doing constructor injection.");
        this.customerRepository1 = customerRepository1;
    }

    public void setCustomerRepository1(CustomerRepository1 customerRepository1) {
        this.customerRepository1 = customerRepository1;
    }

    @Override
    public List<Customer> finalAll(){
        return customerRepository1.findAll();
    }
}
