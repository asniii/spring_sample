import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.CustomerRepository;
import repository.CustomerRepositoryConstructor;
import repository.HibernateCustomerRepositoryImpl;
import repository.HibernateCustomerRepositoryImplConstructor;
import service.CustomerService;
import service.CustomerServiceConstructor;
import service.CustomerServiceImpl;
import service.CustomerServiceImplConstructor;

@Configuration
public class AppConfig {


    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.setCustomerRepository(getCustomerRepository());
        return service;
    }


    // Constructor injection example below this comment
    @Bean(name = "customerRepositoryConstructor")
    public CustomerRepositoryConstructor getCustomerRepositoryContructor(){
        return new HibernateCustomerRepositoryImplConstructor();
    }

    @Bean(name = "customerServiceConstructor")
    public CustomerServiceConstructor getCustomerServiceConstructor(){
        CustomerServiceConstructor service = new CustomerServiceImplConstructor(getCustomerRepositoryContructor());
        return service;
    }

}
