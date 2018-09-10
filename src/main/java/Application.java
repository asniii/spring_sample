import com.aditya.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){

        /**
         * There are 5 scopes available inside a spring application for us to configure a bean for use.
         *
         * scopes valid for any configuration is :
         *      singleton
         *      prototype
         *
         * valid only in web-aware projects
         *      Request
         *      Session
         *      Global
         *
         *
         * the singleton design pattern restrict the instantiation of class to one object. This is the default scope. That means
         * Single instance per Spring container.
         *
         * but a prototype scope gives a new bean everytime we ask for.
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(service);

        System.out.println("********************************************************************************************");

        CustomerService service1 = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(service1);

        /**
         * For xml configuration
         *
         *
         <bean name="customerRepository"
         class="repository.HibernateCustomerRepositoryImpl"
         scope="prototype">
         </bean>

         */


    }
}
