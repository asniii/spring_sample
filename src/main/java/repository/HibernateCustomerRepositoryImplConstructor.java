package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImplConstructor implements CustomerRepositoryConstructor {
    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("aditya");
        customer.setLastname("nehra");
        customers.add(customer);
        return customers;
    }
}
