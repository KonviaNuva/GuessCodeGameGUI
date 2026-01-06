package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public static final int WINDOW_WIDTH = 1200;
    public static final int WINDOW_HEIGHT = 900;

    private static GameWindow gameWindow;
    private Container container;
    private JPanel activeScreen;

    private MainMenuScreen mainMenuScreen;
    private GameplayScreen gameplayScreen;

    public static GameWindow getGameWindow() {
        if (gameWindow == null) {
            gameWindow = new GameWindow();
        }
        return gameWindow;
    }

    private GameWindow() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.container = this.getContentPane();

        //going to add all our screens to the gameWindow
        mainMenuScreen = MainMenuScreen.getMainMenuScreen();
        gameplayScreen = GameplayScreen.getGameplayScreen();

        this.changeToScreen(mainMenuScreen);
        this.setVisible(true);
    }

    private void changeToScreen(JPanel newScreen) {

        if (activeScreen != null){
            activeScreen.setVisible(false);
        }

        activeScreen = newScreen;
        activeScreen.setVisible(true);
    }

    /*enum Screen {
        MAIN_MENU,
        GAMEPLAY
    }*/
}
