package com.example.assignment2.products;

public class EpicPayment implements PaymentMethod {
    @Override
    public String pay(String game, double price) {
        return String.format("Paid %.2f for %s through Epic Games", price, game);
    }
}
