package de.geisslerbenjamin.patterns.structural.adapter;

import de.geisslerbenjamin.patterns.structural.adapter.interfaces.MediaPlayerInterface;
import de.geisslerbenjamin.patterns.structural.adapter.interfaces.MoviePlayerInterface;

/**
 * Adapter class which passes the method class from the new interface (= Target) to the old interface or
 * class (= Adaptee). If there is a different or more complex logic to transfer the calls, it's done in this class.
 * Created by Benjamin on 09.01.14.
 */
public class MoviePlayerToMediaPlayerAdapter implements MediaPlayerInterface {
    private MoviePlayerInterface player;

    /**
     * Constructor which takes a instance of the adaptee as parameter
     *
     * @param player instance of the media player
     */
    public MoviePlayerToMediaPlayerAdapter(MoviePlayerInterface player) {
        this.player = player;
    }

    @Override
    public boolean play() {
        return this.player.startMovie().isMoveRunning();
    }

    @Override
    public boolean pause() {
        return !this.player.pauseMovie().isMoveRunning();

    }

    @Override
    public boolean stop() {
        return !this.player.pauseMovie().goToStart().isMoveRunning();
    }
}
