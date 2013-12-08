package de.geisslerbenjamin.patterns.statepattern;

import de.geisslerbenjamin.patterns.statepattern.interfaces.DoorInterface;
import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;

/**
 * A locked door, which can only be unlocked with the right key.
 * Created by Benjamin on 06.12.13.
 */
public class LockedDoor extends AbstractDoor {
    public LockedDoor(KeyInterface key) {
        super(key);
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public boolean isClosed() {
        return true;
    }

    @Override
    public boolean isLocked() {
        return true;
    }

    @Override
    public DoorInterface unlock(KeyInterface key) {
        if (this.key.getNumber() == key.getNumber()) {
            return new ClosedDoor(this.key);
        }

        throw new DoorException("Wrong key! Door could not be unlocked!");
    }
}
