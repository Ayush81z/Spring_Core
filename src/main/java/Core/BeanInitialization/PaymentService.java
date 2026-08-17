package Core.BeanInitialization;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public PaymentService() {
        System.out.println("Payment service created");
    }

    public void pay() {
        System.out.println("Payment done using Credit card");
    }

}
