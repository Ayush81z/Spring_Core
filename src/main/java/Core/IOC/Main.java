package Core.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //it is saying get the beans from the IOC which in our case is a application context
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}

