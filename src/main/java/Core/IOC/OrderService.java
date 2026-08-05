package Core.IOC;

import Core.IOC.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //manage the class orderservice
public class OrderService {

    PaymentService paymentService;

     //to inject the dependency via constructor , if a single constructor then not required
    //@Qualifier() in the constructor says which one to give the priority
    public OrderService(@Qualifier("cardPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @Autowired //this is a setter injection in spring
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order placed !");
    }
}
