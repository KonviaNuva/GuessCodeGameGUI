package org.example;

import javax.swing.*;

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

}
