package org.example;

import javax.swing.*;
import java.awt.*;

public class GameplayScreen extends JPanel {

    private static GameplayScreen gameplayScreen;

    private JPanel backButtonPanel;
    private JPanel instructionPanel;
    private JPanel attemptsPanel;
    private JPanel guessPanel;
    private JPanel lastResultPanel;

    private JButton backButton;
    private JLabel instructionLabel;
    private JTextField guessTextField;
    private JTextArea lastResultTextArea;
    private JLabel attemptsLabel;
    private JTextArea attemptsTextArea;
    private JScrollPane attemptsScrollPane;

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
        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(buttonFont);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);

        instructionPanel = new JPanel();
        instructionPanel.setBounds(100, 100, 200, 50);
        instructionPanel.setBackground(Color.BLUE);
        instructionPanel.setVisible(true);
        this.add(instructionPanel);
        instructionLabel = new JLabel("Enter the code");
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setFont(normalFont);
        instructionPanel.add(instructionLabel);

        guessPanel = new JPanel();
        guessPanel.setBounds(100, 150, 200, 50);
        guessPanel.setBackground(Color.RED);
        guessPanel.setVisible(true);
        this.add(guessPanel);
        guessTextField = new JTextField(6);
        guessTextField.setFont(normalFont);
        guessTextField.setBackground(Color.BLACK);
        guessTextField.setForeground(Color.WHITE);
        guessPanel.add(guessTextField);

        lastResultPanel = new JPanel();
        lastResultPanel.setBounds(25, 225, 350, 150);
        lastResultPanel.setBackground(Color.CYAN);
        lastResultPanel.setVisible(true);
        this.add(lastResultPanel);
        lastResultTextArea = new JTextArea(3, 12);
        lastResultTextArea.setFont(normalFont);
        lastResultTextArea.setBackground(Color.BLACK);
        lastResultTextArea.setForeground(Color.WHITE);
        lastResultTextArea.setEditable(false);
        lastResultTextArea.setText("1234 is a wrong guess\n2 correct digits\n2 misplaced digits");
        lastResultPanel.add(lastResultTextArea);

        attemptsPanel = new JPanel();
        attemptsPanel.setBounds(400, 0, 400, 600);
        attemptsPanel.setBackground(Color.CYAN);
        attemptsPanel.setVisible(true);
        this.add(attemptsPanel);
        attemptsLabel = new JLabel("№       correct       misplaced");
        attemptsLabel.setForeground(Color.WHITE);
        attemptsLabel.setFont(normalFont);
        attemptsPanel.add(attemptsLabel);
        attemptsTextArea = new JTextArea(14, 15);
        attemptsTextArea.setLineWrap(true);
        attemptsTextArea.setWrapStyleWord(true);
        attemptsTextArea.setFont(normalFont);
        attemptsTextArea.setBackground(Color.BLACK);
        attemptsTextArea.setForeground(Color.WHITE);
        attemptsTextArea.setEditable(true);
        attemptsTextArea.setText("1         2               2");
        attemptsScrollPane = new JScrollPane(attemptsTextArea);
        attemptsPanel.add(attemptsScrollPane);
    }
}
