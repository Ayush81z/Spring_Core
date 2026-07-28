package Core.loosecoupling;

import Core.loosecoupling.notification.EmailService;
import Core.loosecoupling.notification.NotificationService;

public class OrderService {
    //instance variable of a interface
    NotificationService notification;

    //common type of DI , via a parameterised constructor
    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    //second type of DI , using setters
    public OrderService() {

    }

    public void placeorder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }

    //setter use for the DI of an default constructor
    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
