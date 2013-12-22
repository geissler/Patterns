package de.geisslerbenjamin.patterns.behavioral.state;

import de.geisslerbenjamin.patterns.behavioral.state.interfaces.DoorActionInterface;
import de.geisslerbenjamin.patterns.behavioral.state.interfaces.DoorInterface;
import de.geisslerbenjamin.patterns.behavioral.state.interfaces.KeyInterface;

/**
 * Class which handel's the different states of the door by wrapping the methods.
 * Created by Benjamin on 06.12.13.
 */
public class Door implements DoorActionInterface {
    /**
     * The actual state of the door
     */
    private DoorInterface state;

    /**
     * Set the starting state of the door
     *
     * @param state DoorInterface
     */
    public Door(DoorInterface state) {
        this.state = state;
    }

    @Override
    public DoorInterface getState() {
        return this.state;
    }

    @Override
    public boolean open() {
        try {
            this.state = this.state.open();
            return true;
        } catch (DoorException e) {
            return false;
        }
    }

    @Override
    public boolean isOpen() {
        return this.state.isOpen();
    }

    @Override
    public boolean close() {
        try {
            this.state = this.state.close();
            return true;
        } catch (DoorException e) {
            return false;
        }
    }

    @Override
    public boolean isClosed() {
        return this.state.isClosed();
    }

    @Override
    public boolean lock(KeyInterface key) {
        try {
            this.state = this.state.lock(key);
            return true;
        } catch (DoorException e) {
            return false;
        }
    }

    @Override
    public boolean isLocked() {
        return this.state.isLocked();
    }

    @Override
    public boolean unlock(KeyInterface key) {
        try {
            this.state = this.state.unlock(key);
            return true;
        } catch (DoorException e) {
            return false;
        }
    }
}
