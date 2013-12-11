package de.geisslerbenjamin.patterns.mediatorpattern.interfaces;

/**
 * A simple event which is passed to the listening listeners with the raised message of the caller.
 * Created by Benjamin on 11.12.13.
 */
public interface EventInterface {
    /**
     * The raised message.
     *
     * @return The raised message
     */
    public String getMessage();
}
