import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CustomerService;
import service.CustomerServiceConstructor;
import service.CustomerServiceImpl;

public class Application {

    public static void main(String args[]){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(service.finalAll().get(0).getLastname());

        System.out.println("********************************************************************************************");

        CustomerServiceConstructor serviceConstructor = applicationContext.getBean("customerServiceConstructor",CustomerServiceConstructor.class);
        System.out.println(serviceConstructor.finalAll().get(0).getFirstname());


    }
}
