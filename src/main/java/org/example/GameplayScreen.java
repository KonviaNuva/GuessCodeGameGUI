package org.example;

import javax.swing.*;
import java.awt.*;

public class GameplayScreen extends JPanel {

    private static GameplayScreen gameplayScreen;

    public static GameplayScreen getGameplayScreen() {
        if (gameplayScreen == null) {
            gameplayScreen = new GameplayScreen();
        }
        return gameplayScreen;
    }

    public GameplayScreen () {
        this.setBounds(0, 0, GameWindow.getWindowWidth(), GameWindow.getWindowHeight());
        this.setBackground(Color.PINK);
        this.setVisible(false);
    }
}
