package org.example;

import javax.swing.*;
import java.awt.*;

public class GameplayScreen extends JPanel {

    private static GameplayScreen gameplayScreen;

    private JPanel backButtonPanel;

    private JButton backButton;

    private final Font buttonFont = new Font("Times New Roman", Font.PLAIN, 40);

    public static GameplayScreen getGameplayScreen() {
        if (gameplayScreen == null) {
            gameplayScreen = new GameplayScreen();
        }
        return gameplayScreen;
    }

    public GameplayScreen () {
        this.setBounds(0, 0, GameWindow.getWindowWidth(), GameWindow.getWindowHeight());
        this.setBackground(Color.PINK);
        this.setLayout(null);
        this.setVisible(false);

        backButtonPanel = new JPanel();
        backButtonPanel.setBounds(0, 0, 140, 70);
        backButtonPanel.setBackground(Color.BLACK);
        backButtonPanel.setVisible(true);
        this.add(backButtonPanel);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(buttonFont);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);
    }
}
