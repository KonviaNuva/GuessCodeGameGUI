package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private static GameWindow gameWindow;
    private JPanel activeScreen;

    private final MainMenuScreen mainMenuScreen;
    private final GameplayScreen gameplayScreen;

    public static int getWindowWidth() {
        return WINDOW_WIDTH;
    }

    public static int getWindowHeight() {
        return WINDOW_HEIGHT;
    }

    public static GameWindow getGameWindow() {
        if (gameWindow == null) {
            gameWindow = new GameWindow();
        }
        return gameWindow;
    }

    public MainMenuScreen getMainMenuScreen() {
        return mainMenuScreen;
    }

    public GameplayScreen getGameplayScreen() {
        return gameplayScreen;
    }

    private GameWindow() {
        super("Guess Code");

        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainMenuScreen = MainMenuScreen.getMainMenuScreen();
        gameplayScreen = GameplayScreen.getGameplayScreen();

        this.getContentPane().add(mainMenuScreen);
        this.getContentPane().add(gameplayScreen);

        this.changeToScreen(mainMenuScreen);

        this.setVisible(true);
    }

    public void changeToScreen(JPanel newScreen) {

        if (activeScreen != null){
            activeScreen.setVisible(false);
        }

        activeScreen = newScreen;
        activeScreen.setVisible(true);
    }
}
