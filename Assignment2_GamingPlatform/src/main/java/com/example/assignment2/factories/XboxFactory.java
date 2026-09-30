package com.example.assignment2.factories;

import com.example.assignment2.products.*;

public class XboxFactory implements GamingFactory {
    @Override
    public GameLauncher createLauncher() {
        return new XboxLauncher();
    }

    @Override
    public PaymentMethod createPayment() {
        return new XboxPayment();
    }

    @Override
    public NotificationService createNotification() {
        return new XboxNotification();
    }

    @Override
    public String getFamilyName() {
        return "Xbox";
    }
}
