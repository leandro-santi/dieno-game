package com.solitudeworks.game;

import com.solitudeworks.ui.GameWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Dino extends JPanel implements Updatable, KeyListener {

    private int gravity;
    private int jumpPower;
    private int ySpeed;
    private boolean onGround;

    public Dino() {
        setSize(40, 80);
        setLocation(40, GameWindow.instance.getHeight() - getHeight() - 40);
        setBackground(new Color(50, 50, 50));

        GameWindow.instance.add(this);
        GameWindow.instance.addKeyListener(this);
        GameWindow.instance.requestFocusInWindow();
        setFocusable(true);

        startStats();
    }

    public void startStats() {
        gravity = 1;
        jumpPower = 20;
    }

    public void jump() {
        if (onGround)
            ySpeed = -jumpPower;
    }

    public boolean collideWith(Component obj) {
        return getBounds().intersects(obj.getBounds());
    }

    @Override
    public void update() {
        Point location = getLocation();
        int groundedY = GameWindow.instance.getHeight() - getHeight();

        ySpeed += gravity;
        location.y += ySpeed;

        if (location.y >= groundedY && ySpeed > 0) {
            ySpeed = 0;
            location.y = groundedY;
            onGround = true;
        } else {
            onGround = false;
        }

        setLocation(location);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
