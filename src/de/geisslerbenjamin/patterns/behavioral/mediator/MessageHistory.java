package de.geisslerbenjamin.patterns.behavioral.mediator;

import java.util.ArrayList;

/**
 * Simple message history, which displays only a couple of the received messages.
 * Created by Benjamin on 11.12.13.
 */
public class MessageHistory {
    private ArrayList<String> messages;
    private int size;

    /**
     * Init and define the maximal number of messages to be displayed.
     *
     * @param size
     */
    public MessageHistory(int size) {
        this.size = size;
        this.messages = new ArrayList<String>();
    }

    /**
     * Add a message
     *
     * @param message
     * @return
     */
    public MessageHistory add(String message) {
        this.messages.add(message);
        return this;
    }

    /**
     * Display the last messages.
     *
     * @return
     */
    public MessageHistory display() {
        int from = 0;
        if (this.messages.size() >= this.size) {
            from = this.messages.size() - this.size;
        }

        while (from < this.messages.size()) {
            System.out.println(this.messages.get(from++));
        }

        return this;
    }
}
