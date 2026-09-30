package com.example.assignment2.creators;

import com.example.assignment2.products.GameLauncher;
import com.example.assignment2.products.SteamLauncher;

public class SteamLauncherCreator extends LauncherCreator {
    @Override
    public GameLauncher createLauncher() {
        return new SteamLauncher();
    }
}
