package com.example.assignment2;

import com.example.assignment2.factories.*;
import com.example.assignment2.products.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcreteProductCreationTest {
    @Test void steamProductsMatchFamily() {
        GamingFactory f = new SteamFactory();
        assertInstanceOf(SteamLauncher.class, f.createLauncher());
        assertInstanceOf(SteamPayment.class, f.createPayment());
        assertInstanceOf(SteamNotification.class, f.createNotification());
    }
    @Test void epicProductsMatchFamily() {
        GamingFactory f = new EpicFactory();
        assertInstanceOf(EpicLauncher.class, f.createLauncher());
        assertInstanceOf(EpicPayment.class, f.createPayment());
        assertInstanceOf(EpicNotification.class, f.createNotification());
    }
    @Test void xboxProductsMatchFamily() {
        GamingFactory f = new XboxFactory();
        assertInstanceOf(XboxLauncher.class, f.createLauncher());
        assertInstanceOf(XboxPayment.class, f.createPayment());
        assertInstanceOf(XboxNotification.class, f.createNotification());
    }
    @Test void playStationProductsMatchFamily() {
        GamingFactory f = new PlayStationFactory();
        assertInstanceOf(PlayStationLauncher.class, f.createLauncher());
        assertInstanceOf(PlayStationPayment.class, f.createPayment());
        assertInstanceOf(PlayStationNotification.class, f.createNotification());
    }
}
