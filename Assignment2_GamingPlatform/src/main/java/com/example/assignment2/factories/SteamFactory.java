package com.example.assignment2.factories;

import com.example.assignment2.products.*;

public class SteamFactory implements GamingFactory {
    @Override
    public GameLauncher createLauncher() {
        return new SteamLauncher();
    }

    @Override
    public PaymentMethod createPayment() {
        return new SteamPayment();
    }

    @Override
    public NotificationService createNotification() {
        return new SteamNotification();
    }

    @Override
    public String getFamilyName() {
        return "Steam";
    }
}
