package de.geisslerbenjamin.patterns.behavioral.mediator.interfaces;

/**
 * A simple mediator, where listener can be registered to be notified if a given event has been raised.
 * Created by Benjamin on 11.12.13.
 */
public interface MediatorInterface {
    /**
     * Register a listener to be notified if a event with the given name has been raised.
     *
     * @param listener
     * @param eventName
     * @return
     */
    public MediatorInterface addListener(ListenerInterface listener, String eventName);

    /**
     * Remove a listener from listening to all events.
     *
     * @param listener
     * @return
     */
    public MediatorInterface removeListener(ListenerInterface listener);

    /**
     * Raise an event by notifying all attached listeners to the given event name.
     *
     * @param name
     * @param event
     * @return
     */
    public MediatorInterface raiseEvent(String name, EventInterface event);
}
