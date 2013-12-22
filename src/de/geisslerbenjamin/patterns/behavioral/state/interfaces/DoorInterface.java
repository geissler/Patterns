package de.geisslerbenjamin.patterns.behavioral.state.interfaces;

/**
 * Interface defining the different actions of a door.
 * Created by Benjamin on 06.12.13.
 */
public interface DoorInterface {
    /**
     * Open a door if the door is not locked or already open.
     *
     * @return DoorInterface
     */
    public DoorInterface open();

    /**
     * Check if the door is open or not.
     *
     * @return boolean
     */
    public boolean isOpen();

    /**
     * Close a open door.
     *
     * @return DoorInterface
     */
    public DoorInterface close();

    /**
     * Check if the door is closed.
     *
     * @return boolean
     */
    public boolean isClosed();

    /**
     * Lock the door if the door is closed and the key has the correct number.
     *
     * @param key key to lock the door
     * @return DoorInterface
     */
    public DoorInterface lock(KeyInterface key);

    /**
     * Check if the door is locked.
     *
     * @return boolean
     */
    public boolean isLocked();

    /**
     * Unlock the door if the door is locked and the key has the correct number.
     *
     * @param key key to unlock the door
     * @return DoorInterface
     */
    public DoorInterface unlock(KeyInterface key);
}
