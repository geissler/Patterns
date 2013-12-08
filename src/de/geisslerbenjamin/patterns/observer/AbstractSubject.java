package de.geisslerbenjamin.patterns.observer;

import de.geisslerbenjamin.patterns.observer.interfaces.ObserverInterface;
import de.geisslerbenjamin.patterns.observer.interfaces.SubjectInterface;

import java.util.ArrayList;

/**
 * Abstract class implementing the method for the SubjectInterface and a method to inform all attached observers.
 */
public abstract class AbstractSubject implements SubjectInterface {
    private ArrayList<ObserverInterface> observers;

    /**
     * Init array.
     */
    public AbstractSubject() {
        this.observers = new ArrayList<ObserverInterface>();
    }

    @Override
    public SubjectInterface addObserver(ObserverInterface observer) {
        this.observers.add(observer);
        return this;
    }

    @Override
    public SubjectInterface removeObserver(ObserverInterface observer) {
        for (ObserverInterface entry : this.observers) {
            if (entry.getClass().equals(observer.getClass())) {
                this.observers.remove(entry);
                break;
            }
        }

        return this;
    }

    /**
     * Call all attached observers and tell them, that the subject has changed.
     */
    protected void notifyAttachedObservers() {
        for (ObserverInterface observer : this.observers) {
            observer.notifyObserver(this);
        }
    }
}