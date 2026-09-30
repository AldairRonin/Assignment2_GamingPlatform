package com.example.assignment2.config;

import com.example.assignment2.factories.*;

public final class FactorySelector {
    private FactorySelector() {}

    public static GamingFactory from(String family) {
        return switch (family.toLowerCase()) {
            case "steam" -> new SteamFactory();
            case "epic" -> new EpicFactory();
            case "xbox" -> new XboxFactory();
            case "playstation", "ps" -> new PlayStationFactory();
            default -> throw new IllegalArgumentException("Unsupported gaming family: " + family);
        };
    }
}
