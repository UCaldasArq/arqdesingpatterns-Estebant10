package edu.ucaldas.behaviour.strategy;

public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via PayPal.");
    }
}
