package de.geisslerbenjamin.patterns.behavioral.observer;

import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.ObserverInterface;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.SubjectInterface;

/**
 * Simple observer class.
 * Created by Benjamin on 08.12.13.
 */
public class AutomaticDoor implements ObserverInterface {
    @Override
    public void notifyObserver(SubjectInterface subject) {
        if (subject instanceof Camera) {
            System.out.println("Welcome home master!");
            System.out.println("##Opening the door##");
        }
    }
}
