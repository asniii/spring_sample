package com.aditya;

import com.aditya.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String args[]){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

        CustomerService service = applicationContext.getBean("customerService",CustomerService.class);
        System.out.println(service.finalAll().get(0).getFirstname());


    }
}
