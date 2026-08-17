package Core.BeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("singleton")//all classes are singleton by default , they are eager initialization

@Scope("prototype") //new object for every call, it does lazy initialization
public class OrderService {

    public OrderService() {
        System.out.println("order service created");
    }

    public void placeOrder() {
        System.out.println("order placed");
    }
}
