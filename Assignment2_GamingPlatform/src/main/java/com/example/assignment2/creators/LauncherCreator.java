package com.example.assignment2.creators;

import com.example.assignment2.products.GameLauncher;

public abstract class LauncherCreator {
    public abstract GameLauncher createLauncher();

    public String launchGame(String game) {
        GameLauncher launcher = createLauncher();
        return launcher.launch(game);
    }
}
