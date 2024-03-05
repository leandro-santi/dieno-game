package com.solitudeworks.game;

import com.solitudeworks.ui.GameWindow;

import javax.swing.*;
import java.awt.*;

public class Cactus extends JPanel implements Updatable {

    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOutOfView() {
        return getX() + getWidth() <= 0;
    }

    public Cactus() {
        setSize(40, 60);
        setLocation(GameWindow.instance.getWidth(), GameWindow.instance.getHeight() - getHeight());
        setBackground(new Color(50, 50, 50));

        GameWindow.instance.add(this);
    }

    public void restart() {
        setLocation(GameWindow.instance.getWidth(), GameWindow.instance.getHeight() - getHeight());
    }

    @Override
    public void update() {
        Point location = getLocation();

        location.x -= speed;

        setLocation(location);
    }

}
