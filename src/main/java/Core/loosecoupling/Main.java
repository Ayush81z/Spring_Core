package Core.loosecoupling;

import Core.loosecoupling.notification.EmailService;
import Core.loosecoupling.notification.NotificationService;
import Core.loosecoupling.notification.SmsService;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new SmsService();
        System.out.println("Hello, World!");

        //Method 1: via a parameterised constructor
//        OrderService order = new OrderService(service);

        //using a defualt  constructor with a setter
        OrderService order = new OrderService();
        order.setNotification(service);
        order.placeorder();
    }
}

//a class should ask what it wants and not build everything itself - the main idea of dependency injection , this is written without spring , spring automates this whole flow of creating the objects in the main also