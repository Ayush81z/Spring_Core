package Core.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //would be using configurableApplicationContext here because the applicationcontext is a parent of it and doesnt hold the (.close())
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(2));

        context.close();
    }
}
