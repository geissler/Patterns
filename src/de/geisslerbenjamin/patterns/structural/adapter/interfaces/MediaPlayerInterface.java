package de.geisslerbenjamin.patterns.structural.adapter.interfaces;

/**
 * Simple "new" media player interface.
 * Created by Benjamin on 09.01.14.
 */
public interface MediaPlayerInterface {
    /**
     * Play the movie.
     *
     * @return success or not
     */
    public boolean play();

    /**
     * Pause the movie.
     *
     * @return success or not
     */
    public boolean pause();

    /**
     * Stop the movie and return to the start.
     *
     * @return success or not
     */
    public boolean stop();
}
