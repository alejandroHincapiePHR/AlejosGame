package main;

import javax.swing.*;

public class GameWindow extends JFrame {

    public static int WINDOW_WIDTH = 800;
    public static int WINDOW_HEIGHT = 1600;
    public GameWindow(GamePanel gamePanel) {
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gamePanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
