package de.geisslerbenjamin.patterns.structural.adapter;

import de.geisslerbenjamin.patterns.structural.adapter.interfaces.MediaPlayerInterface;

/**
 * Simple MediaPlayerInterface implementation.
 * Created by Benjamin on 09.01.14.
 */
public class BlueRayPlayer implements MediaPlayerInterface {
    private boolean isRunning;

    public BlueRayPlayer() {
        this.isRunning = false;
    }

    @Override
    public boolean play() {
        this.isRunning = true;
        return true;
    }

    @Override
    public boolean pause() {
        this.isRunning = false;
        return true;
    }

    @Override
    public boolean stop() {
        this.isRunning = false;
        return true;
    }
}
