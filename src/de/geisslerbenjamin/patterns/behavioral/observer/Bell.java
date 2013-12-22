package de.geisslerbenjamin.patterns.behavioral.observer;

import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.BellInterface;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.PersonInterface;

/**
 * Simple bell, which can be pushed so that all attached observers will be informed.
 * Created by Benjamin on 08.12.13.
 */
public class Bell extends AbstractSubject implements BellInterface {
    private boolean alarm;
    private PersonInterface person;

    /**
     * Set the alarm
     *
     * @param alarm enable or disabled the alarm
     */
    public Bell(boolean alarm) {
        super();
        this.alarm = alarm;
    }

    @Override
    public BellInterface setAlarm(boolean alarm) {
        this.alarm = alarm;
        return this;
    }

    @Override
    public PersonInterface getPerson() {
        return this.person;
    }

    @Override
    public BellInterface push(PersonInterface person) {
        this.person = person;
        this.notifyAttachedObservers();

        if (this.alarm) {
            System.out.println("**Ring Ring Ring!**");
        }

        return this;
    }
}
