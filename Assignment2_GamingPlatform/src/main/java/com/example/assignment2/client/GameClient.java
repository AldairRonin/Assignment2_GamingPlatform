package com.example.assignment2.client;

import com.example.assignment2.factories.GamingFactory;
import com.example.assignment2.products.*;

public class GameClient {
    private final GamingFactory factory;

    public GameClient(GamingFactory factory) {
        this.factory = factory;
    }

    public String purchaseGame(String game, double price) {
        PaymentMethod payment = factory.createPayment();
        NotificationService notification = factory.createNotification();

        String paymentResult = payment.pay(game, price);
        String notificationResult = notification.send("Purchase completed: " + game);

        return paymentResult + " | " + notificationResult;
    }

    public String launchGame(String game) {
        GameLauncher launcher = factory.createLauncher();
        NotificationService notification = factory.createNotification();

        String launchResult = launcher.launch(game);
        String notificationResult = notification.send("Game launched: " + game);

        return launchResult + " | " + notificationResult;
    }

    public String completePurchaseAndLaunch(String game, double price) {
        PaymentMethod payment = factory.createPayment();
        GameLauncher launcher = factory.createLauncher();
        NotificationService notification = factory.createNotification();

        String paymentResult = payment.pay(game, price);
        String launchResult = launcher.launch(game);
        String notificationResult = notification.send(
                "Purchase and launch completed: " + game
        );

        return paymentResult + " | " + launchResult + " | " + notificationResult;
    }
}
