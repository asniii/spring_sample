import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.CustomerService1;

public class Application {

    public static void main(String args[]){
        //CustomerService customerService = new CustomerServiceImpl();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        CustomerService service = (CustomerService) applicationContext.getBean("customerService");
        CustomerService customerServiceConst = applicationContext.getBean("customerServiceConst",CustomerService.class);

        System.out.println(service.finalAll().get(0).getFirstname());
        System.out.println(customerServiceConst.finalAll().get(0).getLastname());

        System.out.println("********************************************************************************************");
        CustomerService1 customerService1 = (CustomerService1)applicationContext.getBean("customerService1");
        System.out.println(customerService1.finalAll().get(0).getLastname());

    }
}
