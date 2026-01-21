package org.example;

import javax.swing.*;
import java.awt.*;

public class MainMenuScreen extends JPanel {

    private static MainMenuScreen mainMenuScreen;

    private JPanel titleLabelPanel;
    private JPanel newGameButtonPanel;
    private JPanel continueButtonPanel;
    private JPanel exitButtonPanel;

    private JLabel titleLabel;
    private JButton newGameButton;
    private JButton continueButton;
    private JButton exitButton;

    private final Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    private final Font buttonFont = new Font("Times New Roman", Font.PLAIN, 60);

    public static MainMenuScreen getMainMenuScreen() {
        if (mainMenuScreen == null) {
            mainMenuScreen = new MainMenuScreen();
        }
        return mainMenuScreen;
    }

    public MainMenuScreen () {
        this.setBounds(0, 0, GameWindow.getWindowWidth(), GameWindow.getWindowHeight());
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(false);

        titleLabelPanel = new JPanel();
        titleLabelPanel.setBounds(100, 50, 600, 100);
        titleLabelPanel.setBackground(Color.BLACK);
        titleLabelPanel.setVisible(true);
        this.add(titleLabelPanel);
        titleLabel = new JLabel("Guess Code");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(titleFont);
        titleLabelPanel.add(titleLabel);

        newGameButtonPanel = new JPanel();
        newGameButtonPanel.setBounds(100, 200, 600, 100);
        newGameButtonPanel.setBackground(Color.BLACK);
        newGameButtonPanel.setVisible(true);
        this.add(newGameButtonPanel);
        newGameButton = new JButton("New game");
        newGameButton.setBackground(Color.BLACK);
        newGameButton.setForeground(Color.WHITE);
        newGameButton.setFont(buttonFont);
        newGameButton.setFocusPainted(false);
        newGameButtonPanel.add(newGameButton);
        newGameButton.addActionListener(e -> {
            GameWindow.getGameWindow().changeToScreen(GameWindow.getGameWindow().getGameplayScreen());
            GameManager.startGame();
            continueButtonPanel.setVisible(true);
        });

        continueButtonPanel = new JPanel();
        continueButtonPanel.setBounds(100, 300, 600, 100);
        continueButtonPanel.setBackground(Color.BLACK);
        continueButtonPanel.setVisible(false);
        this.add(continueButtonPanel);
        continueButton = new JButton("Continue");
        continueButton.setBackground(Color.BLACK);
        continueButton.setForeground(Color.WHITE);
        continueButton.setFont(buttonFont);
        continueButton.setFocusPainted(false);
        continueButtonPanel.add(continueButton);
        continueButton.addActionListener(e -> {
            GameWindow.getGameWindow().changeToScreen(GameWindow.getGameWindow().getGameplayScreen());
        });

        exitButtonPanel = new JPanel();
        exitButtonPanel.setBounds(100, 400, 600, 100);
        exitButtonPanel.setBackground(Color.BLACK);
        exitButtonPanel.setVisible(true);
        this.add(exitButtonPanel);
        exitButton = new JButton("Exit");
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFont(buttonFont);
        exitButton.setFocusPainted(false);
        exitButtonPanel.add(exitButton);
        exitButton.addActionListener(e -> {
            System.exit(0);   // завершает всё приложение
        });
    }
}
