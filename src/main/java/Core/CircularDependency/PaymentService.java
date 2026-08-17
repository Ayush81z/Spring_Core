package Core.CircularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    //should not be used here , cause the order service is resolved in the order service
//    @Autowired
//    private OrderService orderService;

//    @Autowired
//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("PAyment done");

        //not the responsibility of pay() to call order service
//        orderService.getOrderDetails();
    }
}
