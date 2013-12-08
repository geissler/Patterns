package de.geisslerbenjamin.patterns.observer;

import de.geisslerbenjamin.patterns.observer.interfaces.BellInterface;
import de.geisslerbenjamin.patterns.observer.interfaces.ObserverInterface;
import de.geisslerbenjamin.patterns.observer.interfaces.SubjectInterface;

/**
 * Tells the people, who is coming.
 * Created by Benjamin on 08.12.13.
 */
public class Caller implements ObserverInterface {
    @Override
    public void notifyObserver(SubjectInterface subject) {
        if (subject instanceof BellInterface) {
            System.out.println("Hello people, " + ((BellInterface) subject).getPerson().getName() + " is coming!");
        }
    }
}
