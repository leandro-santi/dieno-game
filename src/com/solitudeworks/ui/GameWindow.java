package com.solitudeworks.ui;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public static GameWindow instance = new GameWindow();

    public GameWindow() {

        super("Dieno");
        setSize(1200, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        JLayeredPane layeredPane = new JLayeredPane();
        setContentPane(layeredPane);

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        setContentPane(panel);

        setLayout(null);
        setUndecorated(false); // or true
        setVisible(true);

    }
}
