package com.example.assignment2.products;

public class EpicNotification implements NotificationService {
    @Override
    public String send(String message) {
        return "Epic Games notification: " + message;
    }
}
