package de.geisslerbenjamin.patterns.mediatorpattern;

import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.EventInterface;
import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.ListenerInterface;
import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.MediatorInterface;

/**
 * Simple chat room user, how is listing to some events.
 * Created by Benjamin on 11.12.13.
 */
public class User implements ListenerInterface {
    private MediatorInterface chatRoom;
    private MessageHistory history;
    private String name;

    /**
     * Simple constructor.
     *
     * @param name
     * @param chatRoom
     */
    public User(String name, MediatorInterface chatRoom) {
        this(name, chatRoom, new MessageHistory(5));
    }

    /**
     * Init the user and register the listeners for the different events.
     *
     * @param name
     * @param chatRoom
     * @param history
     */
    public User(String name, MediatorInterface chatRoom, MessageHistory history) {
        this.chatRoom = chatRoom;
        this.history = history;
        this.name = name;

        this.chatRoom.raiseEvent("user.join", new SimpleEvent(this.name + " has joined the room"));
        this.chatRoom.addListener(this, "user.join");
        this.chatRoom.addListener(this, "user.quit");
        this.chatRoom.addListener(this, "message.write");
        this.chatRoom.addListener(this, "message.write.to." + this.name);
    }

    /**
     * Write a message in the chat room, which can all user read.
     *
     * @param message
     */
    public void write(String message) {
        this.chatRoom.raiseEvent("message.write", new SimpleEvent(this.name + " says: '" + message + "'"));
    }

    /**
     * Write a message to a single user.
     *
     * @param message message
     * @param user    name of the receiving user
     */
    public void writeTo(String message, String user) {
        this.chatRoom.raiseEvent("message.write.to." + user, new SimpleEvent(this.name + " says to " + user + ": '" + message + "'"));
    }

    /**
     * Leave the chat room and remove the listener.
     */
    public void quit() {
        this.chatRoom.removeListener(this);
        this.chatRoom.raiseEvent("user.quit", new SimpleEvent(this.name + " has left the room"));
    }

    @Override
    public ListenerInterface receiveEvent(String name, EventInterface event) {
        System.out.println("----------------------------");
        System.out.println("Chat window of " + this.name);

        this
                .history
                .add(event.getMessage())
                .display();

        return this;
    }
}
