package de.geisslerbenjamin.patterns.observer;

import de.geisslerbenjamin.patterns.observer.interfaces.BellInterface;
import de.geisslerbenjamin.patterns.observer.interfaces.ObserverInterface;
import de.geisslerbenjamin.patterns.observer.interfaces.PersonInterface;
import de.geisslerbenjamin.patterns.observer.interfaces.SubjectInterface;

import java.util.ArrayList;

/**
 * Simple observer and subject which tests if the ringing person is one of the owners of the house.
 * Created by Benjamin on 08.12.13.
 */
public class Camera extends AbstractSubject implements ObserverInterface, SubjectInterface {
    private ArrayList<PersonInterface> owners;

    /**
     * Init array.
     */
    public Camera() {
        super();
        this.owners = new ArrayList<PersonInterface>();
    }

    /**
     * Add owner.
     *
     * @param owner owner of the house
     * @return self
     */
    public Camera addOwner(PersonInterface owner) {
        this.owners.add(owner);
        return this;
    }

    @Override
    public void notifyObserver(SubjectInterface subject) {
        if (subject instanceof BellInterface) {
            if (this.isOwner(((BellInterface) subject).getPerson())) {
                ((BellInterface) subject).setAlarm(false);
                this.notifyAttachedObservers();
            }
        }
    }

    /**
     * Test if the person is one of the owners of the house.
     *
     * @param person person to check
     * @return boolean
     */
    private boolean isOwner(PersonInterface person) {
        for (PersonInterface owner : this.owners) {
            if (owner.getName().equals(person.getName())) {
                return true;
            }
        }

        return false;
    }
}
