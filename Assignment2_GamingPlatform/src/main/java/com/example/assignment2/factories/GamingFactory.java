package com.example.assignment2.factories;

import com.example.assignment2.products.GameLauncher;
import com.example.assignment2.products.PaymentMethod;
import com.example.assignment2.products.NotificationService;

public interface GamingFactory {
    GameLauncher createLauncher();
    PaymentMethod createPayment();
    NotificationService createNotification();
    String getFamilyName();
}
