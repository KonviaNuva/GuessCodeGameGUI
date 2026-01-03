package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow singleGameWindow;

    public static GameWindow getGameWindow()
    {
        if (singleGameWindow == null)
        {
            singleGameWindow = new GameWindow();
        }
        return singleGameWindow;
    }

    public GameWindow()
    {
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setCondition(Condition.MAIN_MENU);
        this.setVisible(true);
    }

    private void setCondition(Condition newCondition)
    {
        switch (newCondition)
        {
            case Condition.MAIN_MENU ->
            {
                this.getContentPane().setBackground(Color.BLACK);
                this.setLayout(null);
            }
            case Condition.GAMEPLAY ->
            {
                //we have no gameplay condition described yet
            }
            default ->
            {
                //do nothing as no valid condition chosen
            }
        }
        return;
    }

    enum Condition{
        MAIN_MENU,
        GAMEPLAY
    }
}
