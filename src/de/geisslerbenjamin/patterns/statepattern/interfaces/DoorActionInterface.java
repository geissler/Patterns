package de.geisslerbenjamin.patterns.statepattern.interfaces;

/**
 * Defines the same methods as the DoorInterface, but with boolean return types for all methods.
 * Created by Benjamin on 06.12.13.
 */
public interface DoorActionInterface {
    /**
     * Retrieve the actual state object of the door.
     *
     * @return DoorInterface
     */
    public DoorInterface getState();

    /**
     * Open a door if the door is not locked or already open.
     *
     * @return boolean
     */
    public boolean open();

    /**
     * Check if the door is open or not.
     *
     * @return boolean
     */
    public boolean isOpen();

    /**
     * Close a open door.
     *
     * @return boolean
     */
    public boolean close();

    /**
     * Check if the door is closed.
     *
     * @return boolean
     */
    public boolean isClosed();

    /**
     * Lock the door if the door is closed and the key has the correct number.
     *
     * @param key to lock the door
     * @return boolean
     */
    public boolean lock(KeyInterface key);

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
     * @return boolean
     */
    public boolean unlock(KeyInterface key);
}
