package de.geisslerbenjamin.patterns.observer.interfaces;

/**
 * Simple subject class, to which different observers could be attached.
 * Created by Benjamin on 08.12.13.
 */
public interface SubjectInterface {
    /**
     * Attach a concrete observer to the actual subject.
     *
     * @param observer the observer which should be attached
     * @return self
     */
    public SubjectInterface addObserver(ObserverInterface observer);

    /**
     * Remove a concrete observer from the actual subject.
     *
     * @param observer the observer which should be removed
     * @return self
     */
    public SubjectInterface removeObserver(ObserverInterface observer);
}
