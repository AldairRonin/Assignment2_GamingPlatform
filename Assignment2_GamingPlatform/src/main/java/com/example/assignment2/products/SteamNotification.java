package com.example.assignment2.products;

public class SteamNotification implements NotificationService {
    @Override
    public String send(String message) {
        return "Steam notification: " + message;
    }
}
