package org.example;

import javax.swing.*;

public class GameplayScreen extends JPanel {

    private static GameplayScreen gameplayScreen;

    public static GameplayScreen getGameplayScreen() {
        if (gameplayScreen == null) {
            gameplayScreen = new GameplayScreen();
        }
        return gameplayScreen;
    }
}
