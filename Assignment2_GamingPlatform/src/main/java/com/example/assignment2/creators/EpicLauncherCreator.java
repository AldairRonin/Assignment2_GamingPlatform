package com.example.assignment2.creators;

import com.example.assignment2.products.GameLauncher;
import com.example.assignment2.products.EpicLauncher;

public class EpicLauncherCreator extends LauncherCreator {
    @Override
    public GameLauncher createLauncher() {
        return new EpicLauncher();
    }
}
