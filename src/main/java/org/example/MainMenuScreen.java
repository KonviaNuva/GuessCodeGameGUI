package org.example;

import javax.swing.*;

public class MainMenuScreen extends JPanel {

    private static MainMenuScreen mainMenuScreen;

    public static MainMenuScreen getMainMenuScreen() {
        if (mainMenuScreen == null) {
            mainMenuScreen = new MainMenuScreen();
        }
        return mainMenuScreen;
    }
}
