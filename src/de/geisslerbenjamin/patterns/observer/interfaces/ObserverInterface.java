package de.geisslerbenjamin.patterns.observer.interfaces;

/**
 * Simple observer class, which will be notified if something has changed.
 * Created by Benjamin on 08.12.13.
 */
public interface ObserverInterface {
    /**
     * Notify all attached observers, that a change has occurred.
     *
     * @param subject the observed subject
     */
    public void notifyObserver(SubjectInterface subject);
}
