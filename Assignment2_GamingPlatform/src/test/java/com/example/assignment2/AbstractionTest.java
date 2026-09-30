package com.example.assignment2;

import com.example.assignment2.client.GameClient;
import com.example.assignment2.factories.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractionTest {
    @Test void clientWorksWithAbstractFactory() {
        GamingFactory factory = new SteamFactory();
        GameClient client = new GameClient(factory);
        assertNotNull(client.purchaseGame("Celeste", 19.99));
    }
    @Test void clientWorksWithoutKnowingConcreteProducts() {
        GamingFactory factory = new PlayStationFactory();
        GameClient client = new GameClient(factory);
        assertTrue(client.launchGame("God of War").contains("PlayStation"));
    }
}
