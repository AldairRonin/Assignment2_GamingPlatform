package com.example.assignment2.products;

public class PlayStationLauncher implements GameLauncher {
    @Override
    public String launch(String game) {
        return "Launching " + game + " through PlayStation";
    }
}
