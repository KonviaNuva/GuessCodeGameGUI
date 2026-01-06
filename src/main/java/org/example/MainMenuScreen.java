package org.example;

import javax.swing.*;
import java.awt.*;

public class MainMenuScreen extends JPanel {

    private static MainMenuScreen mainMenuScreen;

    public static MainMenuScreen getMainMenuScreen() {
        if (mainMenuScreen == null) {
            mainMenuScreen = new MainMenuScreen();
        }
        return mainMenuScreen;
    }

    public MainMenuScreen () {
        this.setBounds(0, 0, GameWindow.getWindowWidth(), GameWindow.getWindowHeight());
        this.setBackground(Color.CYAN);
        this.setVisible(false);
    }
}
