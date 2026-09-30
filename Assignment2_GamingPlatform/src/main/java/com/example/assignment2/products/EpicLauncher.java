package com.example.assignment2.products;

public class EpicLauncher implements GameLauncher {
    @Override
    public String launch(String game) {
        return "Launching " + game + " through Epic Games";
    }
}
