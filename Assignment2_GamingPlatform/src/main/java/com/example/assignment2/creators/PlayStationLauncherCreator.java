package com.example.assignment2.creators;

import com.example.assignment2.products.GameLauncher;
import com.example.assignment2.products.PlayStationLauncher;

public class PlayStationLauncherCreator extends LauncherCreator {
    @Override
    public GameLauncher createLauncher() {
        return new PlayStationLauncher();
    }
}
