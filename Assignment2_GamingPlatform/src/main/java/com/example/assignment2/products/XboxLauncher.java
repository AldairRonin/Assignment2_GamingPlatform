package com.example.assignment2.products;

public class XboxLauncher implements GameLauncher {
    @Override
    public String launch(String game) {
        return "Launching " + game + " through Xbox";
    }
}
