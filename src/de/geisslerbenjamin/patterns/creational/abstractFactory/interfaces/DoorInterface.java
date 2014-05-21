package de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces;

/**
 * Created by Benjamin on 08.12.13.
 */
public interface DoorInterface extends MovementActionInterface {
    public boolean isOpen();

    public DoorInterface open();

    public DoorInterface close();
}
