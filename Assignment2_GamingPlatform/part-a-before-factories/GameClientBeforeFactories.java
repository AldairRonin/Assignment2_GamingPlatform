package com.example.assignment2.partA;

public class GameClientBeforeFactories {
    public void purchaseGame(String platform, String game, double price) {
        if (platform.equals("steam")) {
            System.out.println("Steam payment for " + game + ": " + price);
            System.out.println("Steam notification: purchase completed");
        } else if (platform.equals("epic")) {
            System.out.println("Epic Games payment for " + game + ": " + price);
            System.out.println("Epic notification: purchase completed");
        } else if (platform.equals("xbox")) {
            System.out.println("Xbox payment for " + game + ": " + price);
            System.out.println("Xbox notification: purchase completed");
        }
    }
}
