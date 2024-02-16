package com.solitudeworks.ui;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public static GameWindow instance = new GameWindow();

    public GameWindow() {
        super("Dieno");
        setSize(1200, 400);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);

        setContentPane(panel);
        setVisible(true);
    }

}
