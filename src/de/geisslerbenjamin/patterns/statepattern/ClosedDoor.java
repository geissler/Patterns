package de.geisslerbenjamin.patterns.statepattern;

import de.geisslerbenjamin.patterns.statepattern.interfaces.DoorInterface;
import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;

/**
 * Closed door, which can be opened and locked with the right key.
 * Created by Benjamin on 06.12.13.
 */
public class ClosedDoor extends AbstractDoor {
    public ClosedDoor(KeyInterface key) {
        super(key);
    }

    @Override
    public DoorInterface open() {
        return new OpenDoor(this.key);
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
    public DoorInterface lock(KeyInterface key) {
        if (key.getNumber() == this.key.getNumber()) {
            return new LockedDoor(this.key);
        }

        throw new DoorException("Wrong Key! Door could not be locked!");
    }

    @Override
    public boolean isLocked() {
        return false;
    }
}
