package de.geisslerbenjamin.patterns.behavioral.command.interfaces;

/**
 * Interface to return to a previous state of an object by storing the actual internal state of the object in an
 * external place and inject it if necessary.
 * Created by Benjamin on 13.12.13.
 */
public interface MementoInterface {
    /**
     * Receive an object holding the actual state of the object.
     *
     * @return Receive an object holding the actual state of the object.
     */
    public MementoStateInterface getMementoState();

    /**
     * Return to the state defined by the injected state.
     *
     * @param state state to return to
     */
    public void setMementoState(MementoStateInterface state);
}
