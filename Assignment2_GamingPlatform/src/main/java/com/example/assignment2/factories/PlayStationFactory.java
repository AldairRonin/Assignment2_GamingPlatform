package com.example.assignment2.factories;

import com.example.assignment2.products.*;

public class PlayStationFactory implements GamingFactory {
    @Override
    public GameLauncher createLauncher() {
        return new PlayStationLauncher();
    }

    @Override
    public PaymentMethod createPayment() {
        return new PlayStationPayment();
    }

    @Override
    public NotificationService createNotification() {
        return new PlayStationNotification();
    }

    @Override
    public String getFamilyName() {
        return "PlayStation";
    }
}
