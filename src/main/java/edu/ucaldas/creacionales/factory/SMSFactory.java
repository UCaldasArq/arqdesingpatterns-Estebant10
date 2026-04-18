package edu.ucaldas.creacionales.factory;

public class SMSFactory extends NotificationFactory {
    Notification createNotification() {
        return new SMSNotification();
    }
}
