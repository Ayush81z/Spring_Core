package Core.IOC.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary //give priority for the bean to be use
@Qualifier
@Component
public class UpiPayment implements PaymentService{
    @Override
    public void pay () {
        System.out.println("Paying via Upi");
    }
}
