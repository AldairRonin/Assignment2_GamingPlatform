package com.example.assignment2.creators;

import com.example.assignment2.products.GameLauncher;
import com.example.assignment2.products.XboxLauncher;

public class XboxLauncherCreator extends LauncherCreator {
    @Override
    public GameLauncher createLauncher() {
        return new XboxLauncher();
    }
}
