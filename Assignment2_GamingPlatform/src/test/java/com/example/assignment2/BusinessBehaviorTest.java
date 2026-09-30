package com.example.assignment2;

import com.example.assignment2.client.GameClient;
import com.example.assignment2.factories.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessBehaviorTest {
    @Test void steamPurchaseUsesSameFamily() {
        String result = new GameClient(new SteamFactory()).purchaseGame("Elden Ring", 59.99);
        assertTrue(result.contains("Steam"));
        assertTrue(result.contains("Elden Ring"));
    }
    @Test void epicLaunchUsesSameFamily() {
        String result = new GameClient(new EpicFactory()).launchGame("Fortnite");
        assertTrue(result.contains("Epic Games"));
        assertTrue(result.contains("Fortnite"));
    }
    @Test void xboxCombinedOperationUsesSameFamily() {
        String result = new GameClient(new XboxFactory()).completePurchaseAndLaunch("Forza", 39.99);
        assertTrue(result.contains("Xbox"));
        assertTrue(result.contains("Forza"));
    }
}
