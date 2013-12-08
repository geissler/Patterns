package de.geisslerbenjamin.patterns.statepattern;

import de.geisslerbenjamin.patterns.statepattern.interfaces.DoorInterface;
import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;

/**
 * Abstract class which throws errors for every method call.
 * Created by Benjamin on 06.12.13.
 */
public abstract class AbstractDoor implements DoorInterface {
    protected KeyInterface key;

    public AbstractDoor(KeyInterface key) {
        this.key = key;
    }

    @Override
    public DoorInterface open() {
        throw new DoorException("Could not open door!");
    }

    @Override
    public boolean isOpen() {
        throw new DoorException("Could not check door state!");
    }

    @Override
    public DoorInterface close() {
        throw new DoorException("Could not close door!");
    }

    @Override
    public boolean isClosed() {
        throw new DoorException("Could not check door state!");
    }

    @Override
    public DoorInterface lock(KeyInterface key) {
        throw new DoorException("Could not lock door!");
    }

    @Override
    public boolean isLocked() {
        throw new DoorException("Could not check door state!");
    }

    @Override
    public DoorInterface unlock(KeyInterface key) {
        throw new DoorException("Could not unlock door!");
    }
}
