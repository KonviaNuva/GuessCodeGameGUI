package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow singleGameWindow;

    public static GameWindow GetGameWindow()
    {
        if (singleGameWindow == null)
        {
            singleGameWindow = new GameWindow();
        }
        return singleGameWindow;
    }

    public GameWindow()
    {
        this.setSize(1600, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setVisible(true);
    }

}
