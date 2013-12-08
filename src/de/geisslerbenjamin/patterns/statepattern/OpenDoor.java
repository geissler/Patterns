package de.geisslerbenjamin.patterns.statepattern;

import de.geisslerbenjamin.patterns.statepattern.interfaces.DoorInterface;
import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;

/**
 * A open door, which can be closed.
 * Created by Benjamin on 06.12.13.
 */
public class OpenDoor extends AbstractDoor {
    public OpenDoor(KeyInterface key) {
        super(key);
    }

    @Override
    public DoorInterface close() {
        return new ClosedDoor(this.key);
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public boolean isLocked() {
        return false;
    }
}
