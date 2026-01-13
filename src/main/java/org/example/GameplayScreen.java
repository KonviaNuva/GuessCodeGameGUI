package org.example;

import javax.swing.*;
import java.awt.*;

public class GameplayScreen extends JPanel {

    private static GameplayScreen gameplayScreen;

    private JPanel backButtonPanel;
    private JPanel instructionPanel;
    private JPanel attemptsPanel;

    private JButton backButton;
    private JLabel instructionLabel;

    private final Font buttonFont = new Font("Times New Roman", Font.PLAIN, 40);
    private final Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);

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
        backButtonPanel.setBackground(Color.YELLOW);
        backButtonPanel.setVisible(true);
        this.add(backButtonPanel);

        instructionPanel = new JPanel();
        instructionPanel.setBounds(100, 100, 200, 50);
        instructionPanel.setBackground(Color.BLUE);
        instructionPanel.setVisible(true);
        this.add(instructionPanel);

        attemptsPanel = new JPanel();
        attemptsPanel.setBounds(400, 0, 400, 600);
        attemptsPanel.setBackground(Color.CYAN);
        attemptsPanel.setVisible(true);
        this.add(attemptsPanel);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(buttonFont);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);

        instructionLabel = new JLabel("Enter the code");
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(normalFont);
        instructionPanel.add(instructionLabel);
    }
}
