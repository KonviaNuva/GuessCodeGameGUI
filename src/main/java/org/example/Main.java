package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GameWindow.GetGameWindow().setSize(1600, 900);
        GameWindow.GetGameWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameWindow.GetGameWindow().getContentPane().setBackground(Color.BLACK);
        GameWindow.GetGameWindow().setLayout(null);
        GameWindow.GetGameWindow().setVisible(true);
    }
}