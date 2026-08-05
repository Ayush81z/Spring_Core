package Core.IOC.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier //either this one or the other qualifier , also if you wanna
@Component
public class CardPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Card payment is done ");
    }
}
