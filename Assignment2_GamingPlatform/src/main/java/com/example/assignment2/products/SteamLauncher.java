package com.example.assignment2.products;

public class SteamLauncher implements GameLauncher {
    @Override
    public String launch(String game) {
        return "Launching " + game + " through Steam";
    }
}
