package com.example.assignment2;

import com.example.assignment2.config.FactorySelector;
import com.example.assignment2.factories.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryCreationTest {
    @Test void steamFactoryCreated() { assertInstanceOf(SteamFactory.class, FactorySelector.from("steam")); }
    @Test void epicFactoryCreated() { assertInstanceOf(EpicFactory.class, FactorySelector.from("epic")); }
    @Test void xboxFactoryCreated() { assertInstanceOf(XboxFactory.class, FactorySelector.from("xbox")); }
    @Test void playStationFactoryCreated() { assertInstanceOf(PlayStationFactory.class, FactorySelector.from("playstation")); }
}
