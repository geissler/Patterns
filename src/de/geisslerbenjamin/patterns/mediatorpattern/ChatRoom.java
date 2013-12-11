package de.geisslerbenjamin.patterns.mediatorpattern;

import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.EventInterface;
import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.ListenerInterface;
import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.MediatorInterface;

import java.util.ArrayList;

/**
 * Simple chat room, which serves as mediator between the different users.
 * Created by Benjamin on 11.12.13.
 */
public class ChatRoom implements MediatorInterface {
    private ArrayList<Listener> listeners;

    /**
     * Init listener array
     */
    public ChatRoom() {
        this.listeners = new ArrayList<Listener>();
    }

    @Override
    public MediatorInterface addListener(ListenerInterface listener, String eventName) {
        for (Listener exists : this.listeners) {
            if (exists.getName().equals(eventName)) {
                exists.addListener(listener);
                return this;
            }
        }

        this.listeners.add(new Listener(eventName, listener));
        return this;
    }

    @Override
    public MediatorInterface removeListener(ListenerInterface listener) {
        for (Listener entries : this.listeners) {
            entries.removeListener(listener);
        }
        return this;
    }

    @Override
    public MediatorInterface raiseEvent(String name, EventInterface event) {
        for (Listener listener : this.listeners) {
            if (listener.getName().equals(name)) {
                listener.raiseEvent(event);
                break;
            }
        }
        return this;
    }

    /**
     * Internal class, mapping the name of an event to multiple instances of listeners.
     */
    private class Listener {
        private String name;
        private ArrayList<ListenerInterface> listeners;

        /**
         * Create new event name.
         *
         * @param name
         * @param listener
         */
        private Listener(String name, ListenerInterface listener) {
            this.name = name;
            this.listeners = new ArrayList<ListenerInterface>();
            this.listeners.add(listener);
        }

        /**
         * Add an listener to the event name
         *
         * @param listener
         * @return
         */
        public Listener addListener(ListenerInterface listener) {
            this.listeners.add(listener);
            return this;
        }

        /**
         * Remove a given listener.
         *
         * @param listener
         * @return
         */
        public Listener removeListener(ListenerInterface listener) {
            if (this.listeners.indexOf(listener) >= 0) {
                this.listeners.remove(listener);
            }
            return this;
        }

        /**
         * Get the name of the event the listeners are listening to.
         *
         * @return
         */
        public String getName() {
            return name;
        }

        /**
         * Inform all listeners about the event and delegate the event object to them.
         *
         * @param event
         * @return
         */
        public Listener raiseEvent(EventInterface event) {
            for (ListenerInterface listener : this.listeners) {
                listener.receiveEvent(this.name, event);
            }
            return this;
        }
    }
}
