package de.geisslerbenjamin.patterns.behavioral.mediator;

import de.geisslerbenjamin.patterns.behavioral.mediator.interfaces.EventInterface;
import de.geisslerbenjamin.patterns.behavioral.mediator.interfaces.ListenerInterface;
import de.geisslerbenjamin.patterns.behavioral.mediator.interfaces.MediatorInterface;

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
