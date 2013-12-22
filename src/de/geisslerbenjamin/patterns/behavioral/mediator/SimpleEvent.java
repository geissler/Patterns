package de.geisslerbenjamin.patterns.behavioral.mediator;

import de.geisslerbenjamin.patterns.behavioral.mediator.interfaces.EventInterface;

/**
 * Simple event, which holds only a message broadcasted to everybody.
 * Created by Benjamin on 11.12.13.
 */
public class SimpleEvent implements EventInterface {
    private String message;

    /**
     * The the message
     *
     * @param message
     */
    public SimpleEvent(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
