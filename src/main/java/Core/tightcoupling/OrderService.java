package Core.tightcoupling;

import Core.tightcoupling.notification.EmailService;
import Core.tightcoupling.notification.NotificationService;

public class OrderService {
    //tightly coupled and also breaks the single resposnsibility principle and the open close principle

    private NotificationService notification = new EmailService();

    public void placeorder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
