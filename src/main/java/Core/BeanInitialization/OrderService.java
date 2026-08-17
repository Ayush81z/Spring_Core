package Core.BeanInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy //this is used to make the class Lazy initialization
public class OrderService {
    PaymentService paymentService;
    //initially the object would be created due to it being eager, but it wont be possible for the method level to inject the dependency if we use @Lazy

    //internally proxy would be provided for the paymentService which wont be the real payment service, but when paymentservice would be called then the object of it would be created.
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("order service created");
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("order placed");
    }
}
