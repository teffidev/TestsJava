package com.platzi.javatests.util.payment_gateway;

public class PaymentRequest {

    private double amount;


    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
