package de.geisslerbenjamin.patterns.structural.adapter;

import de.geisslerbenjamin.patterns.structural.adapter.interfaces.MoviePlayerInterface;

/**
 * Simple MoviePlayerInterface implementation.
 * Created by Benjamin on 09.01.14.
 */
public class DVDPlayer implements MoviePlayerInterface {
    private boolean running;
    private int position;

    /**
     * Constructor.
     */
    public DVDPlayer() {
        this.running = false;
        this.position = 0;
    }

    @Override
    public MoviePlayerInterface startMovie() {
        this.running = true;
        this.position++;
        return this;
    }

    @Override
    public MoviePlayerInterface pauseMovie() {
        this.running = false;
        return this;
    }

    @Override
    public MoviePlayerInterface goToStart() {
        if (!this.running) {
            this.position = 0;
        }

        return this;
    }

    @Override
    public boolean isMoveRunning() {
        return this.running;
    }
}
