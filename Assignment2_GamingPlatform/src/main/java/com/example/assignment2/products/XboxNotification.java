package com.example.assignment2.products;

public class XboxNotification implements NotificationService {
    @Override
    public String send(String message) {
        return "Xbox notification: " + message;
    }
}
