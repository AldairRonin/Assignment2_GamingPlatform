package com.example.assignment2.products;

public class PlayStationNotification implements NotificationService {
    @Override
    public String send(String message) {
        return "PlayStation notification: " + message;
    }
}
