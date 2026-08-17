package Core.CircularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        PaymentService pay = context.getBean(PaymentService.class);
//        pay.pay();

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
    }
}
