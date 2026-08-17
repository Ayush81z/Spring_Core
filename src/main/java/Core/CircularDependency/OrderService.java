package Core.CircularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService paymentService;
    //if we create a empty field and later provide the dependency
    //first and foremost circular dependency should not occur in the  prod code at all , even though you resolve it via fields , it also breaks the SOLID (single responsibility principle) , check payement service (pay()) method.
    // OUR CORE IDEA SHOULD BE TO IMPROVE THE CODE RATHER THAN RESOLVING THE DEPENDENCY

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        //call here instead of pay() which breaks SOLID
        getOrderDetails();
        System.out.println("order placed");
    }

    public void getOrderDetails() {
        System.out.println("Order Details");
    }
}
