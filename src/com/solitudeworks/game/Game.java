package com.solitudeworks.game;

public class Game implements Updatable {

    private boolean running = true;
    private final Dino dino = new Dino();
    private Cactus cactus = new Cactus();

    public boolean isRunning() {
        return running;
    }

    @Override
    public void update() {
        dino.update();
        cactus.update();
    }
}
