package de.geisslerbenjamin.patterns.structural.adapter.interfaces;

/**
 * Simple "old" movie player interface.
 * Created by Benjamin on 09.01.14.
 */
public interface MoviePlayerInterface {
    /**
     * Start the movie
     *
     * @return self
     */
    public MoviePlayerInterface startMovie();

    /**
     * Pause the movie.
     *
     * @return self
     */
    public MoviePlayerInterface pauseMovie();

    /**
     * Go to the start of the movie, if the movie is not running.
     *
     * @return self
     */
    public MoviePlayerInterface goToStart();

    /**
     * Test if the movie is running.
     *
     * @return if the movie is running
     */
    public boolean isMoveRunning();
}
