package com.solitudeworks;

import javax.swing.*;
import java.awt.*;

public class Tests {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Panel with Square");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new SquarePanel();
        panel.setBackground(Color.LIGHT_GRAY);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static class SquarePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillRect(50, 50, 100, 100); // coordenadas x, y, largura, altura
        }
    }

}
