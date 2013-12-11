package de.geisslerbenjamin.patterns.mediatorpattern;

import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.EventInterface;
import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.ListenerInterface;
import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.MediatorInterface;

/**
 * Simple listener, which logs all joining users of a chat room.
 * Created by Benjamin on 11.12.13.
 */
public class UserLog implements ListenerInterface {
    /**
     * Register the user log listener.
     *
     * @param chatRoom
     */
    public UserLog(MediatorInterface chatRoom) {
        chatRoom.addListener(this, "user.join");
    }

    @Override
    public ListenerInterface receiveEvent(String name, EventInterface event) {
        System.out.println("##User log: " + event.getMessage() + "##");
        return this;
    }
}
