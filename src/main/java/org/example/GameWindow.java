package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow gameWindow;
    private Container container;

    public static GameWindow getGameWindow() {
        if (gameWindow == null) {
            gameWindow = new GameWindow();
        }
        return gameWindow;
    }

    private GameWindow() {
        this.setSize(1200, 900);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setCondition(Screen.MAIN_MENU);
        this.setVisible(true);
        this.container = this.getContentPane();
    }

    private void setCondition(Screen newCondition) {
        switch (newCondition) {
            case Screen.MAIN_MENU -> {
                this.getContentPane().setBackground(Color.BLACK);
                this.setLayout(null);
            }
            case Screen.GAMEPLAY -> {
                //we have no gameplay screen described yet
            }
            default -> {
                //do nothing as no valid condition chosen
            }
        }
        return;
    }

    enum Screen {
        MAIN_MENU,
        GAMEPLAY
    }
}
