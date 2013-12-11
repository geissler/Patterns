package de.geisslerbenjamin.patterns.mediatorpattern.interfaces;

/**
 * A simple listener interface defining one method to receive an occurred event.
 * Created by Benjamin on 11.12.13.
 */
public interface ListenerInterface {
    /**
     * Receive the event the listener is listening to.
     *
     * @param name  name of the event
     * @param event event object containing the given data
     * @return
     */
    public ListenerInterface receiveEvent(String name, EventInterface event);
}
