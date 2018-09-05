package service;

import model.Customer;
import repository.CustomerRepositoryConstructor;

import java.util.List;

public class CustomerServiceImplConstructor implements CustomerServiceConstructor {

    private CustomerRepositoryConstructor customerRepositoryConstructor;


    public CustomerServiceImplConstructor(CustomerRepositoryConstructor customerRepositoryConstructor) {
        this.customerRepositoryConstructor = customerRepositoryConstructor;
    }

    @Override
    public List<Customer> finalAll(){
        return customerRepositoryConstructor.findAll();
    }

}
