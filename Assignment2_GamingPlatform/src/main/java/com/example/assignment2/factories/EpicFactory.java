package com.example.assignment2.factories;

import com.example.assignment2.products.*;

public class EpicFactory implements GamingFactory {
    @Override
    public GameLauncher createLauncher() {
        return new EpicLauncher();
    }

    @Override
    public PaymentMethod createPayment() {
        return new EpicPayment();
    }

    @Override
    public NotificationService createNotification() {
        return new EpicNotification();
    }

    @Override
    public String getFamilyName() {
        return "Epic Games";
    }
}
