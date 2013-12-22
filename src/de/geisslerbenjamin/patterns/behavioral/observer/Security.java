package de.geisslerbenjamin.patterns.behavioral.observer;

import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.BellInterface;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.ObserverInterface;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.PersonInterface;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.SubjectInterface;

/**
 * Simple observer which is counting the number of times a person has ringed the bell
 * Created by Benjamin on 08.12.13.
 */
public class Security implements ObserverInterface {
    private PersonInterface lastPerson;
    private int countRinging;
    private int maxRinging;

    /**
     * Set the maximal number of times the bell should be ringed
     *
     * @param maxRinging max number of times ringing is allowed
     */
    public Security(int maxRinging) {
        this.maxRinging = maxRinging;
    }

    @Override
    public void notifyObserver(SubjectInterface subject) {
        if (subject instanceof BellInterface) {
            if (this.lastPerson != null
                    && this.lastPerson.getName().equals(((BellInterface) subject).getPerson().getName())) {
                this.countRinging++;

                if (this.countRinging > this.maxRinging) {
                    System.out.println(
                            this.lastPerson.getName() + " has ringed the bell way to often! Alarm will be disabled!"
                    );
                    ((BellInterface) subject).setAlarm(false);
                }
            } else {
                this.lastPerson = ((BellInterface) subject).getPerson();
                this.countRinging = 1;
                ((BellInterface) subject).setAlarm(true);
            }
        }
    }
}
