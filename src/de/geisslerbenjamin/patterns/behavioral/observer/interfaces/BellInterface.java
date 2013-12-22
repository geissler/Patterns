package de.geisslerbenjamin.patterns.behavioral.observer.interfaces;

/**
 * Simple bell which extends the SubjectInterface.
 * Created by Benjamin on 08.12.13.
 */
public interface BellInterface extends SubjectInterface {
    /**
     * Enable or disable the alarm.
     *
     * @param alarm enable or disable the alarm
     * @return self
     */
    public BellInterface setAlarm(boolean alarm);

    /**
     * Get the ringing person.
     *
     * @return the ringing person
     */
    public PersonInterface getPerson();

    /**
     * A person is pushing the bell, which will be ringing if activated and notify all observers about the action.
     *
     * @param person ringing person
     * @return self
     */
    public BellInterface push(PersonInterface person);
}
