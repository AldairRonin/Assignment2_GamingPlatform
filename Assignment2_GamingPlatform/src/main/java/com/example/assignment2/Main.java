package com.example.assignment2;

import com.example.assignment2.client.GameClient;
import com.example.assignment2.config.FactorySelector;
import com.example.assignment2.factories.GamingFactory;

public class Main {
    public static void main(String[] args) {
        String family = args.length > 0 ? args[0] : "steam";

        GamingFactory factory = FactorySelector.from(family);
        GameClient client = new GameClient(factory);

        System.out.println("Selected family: " + factory.getFamilyName());
        System.out.println(client.purchaseGame("Elden Ring", 59.99));
        System.out.println(client.launchGame("Elden Ring"));
        System.out.println(client.completePurchaseAndLaunch("Hades II", 29.99));
    }
}
