package edu.ucaldas.creacionales.factory;

public class EmailFactory extends NotificationFactory {
    Notification createNotification() {
        return new EmailNotification();
    }
}
