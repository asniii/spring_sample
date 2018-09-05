package com.aditya;

import com.aditya.service.CustomerServiceSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aditya.service.CustomerService;

public class Application {

    public static void main(String args[]){
        //CustomerService customerService = new CustomerServiceImpl();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");


        /*
        Stereotype annotations - There are 3. @component, @Service, @Repository. All there are same semantically.
        @Component is used for regular component or beans ( basically pojo).
        @Service is used for tier dealing with business logic.
        @Repository is used for data layer.
         */

        /*
         Autowire - this can be done at 3 place
            Member variable
            Constructor
            Setter
         */

        CustomerService service = applicationContext.getBean("customerService",CustomerService.class);
        System.out.println(service.finalAll().get(0).getFirstname());


        CustomerServiceSetter serviceSetter = applicationContext.getBean("customerServiceSetter",CustomerServiceSetter.class);
        System.out.println(serviceSetter.findAll().get(0).getFirstname());

        // Autowired Constructor injection is similar to setter injection

    }
}
