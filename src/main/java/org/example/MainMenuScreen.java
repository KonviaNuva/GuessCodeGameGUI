package org.example;

import javax.swing.*;
import java.awt.*;

public class MainMenuScreen extends JPanel {

    private static MainMenuScreen mainMenuScreen;

    private JPanel titleLabelPanel;
    private JPanel playButtonPanel;
    private JPanel exitButtonPanel;

    private JLabel titleLabel;
    private JButton playButton;
    private JButton exitButton;

    private Font titleFont;
    private Font buttonFont;

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

        playButtonPanel = new JPanel();
        playButtonPanel.setBounds(100, 250, 600, 100);
        playButtonPanel.setBackground(Color.BLACK);
        playButtonPanel.setVisible(true);
        this.add(playButtonPanel);

        exitButtonPanel = new JPanel();
        exitButtonPanel.setBounds(100, 400, 600, 100);
        exitButtonPanel.setBackground(Color.BLACK);
        exitButtonPanel.setVisible(true);
        this.add(exitButtonPanel);

        titleFont = new Font("Times New Roman", Font.PLAIN, 90);
        buttonFont = new Font("Times New Roman", Font.PLAIN, 60);

        titleLabel = new JLabel("Guess Code");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(titleFont);
        titleLabelPanel.add(titleLabel);

        playButton = new JButton("Play");
        playButton.setBackground(Color.BLACK);
        playButton.setForeground(Color.WHITE);
        playButton.setFont(buttonFont);
        playButton.setFocusPainted(false);
        playButtonPanel.add(playButton);

        exitButton = new JButton("Exit");
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFont(buttonFont);
        exitButton.setFocusPainted(false);
        exitButtonPanel.add(exitButton);
    }
}
