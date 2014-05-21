package de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces;

/**
 * Created by Benjamin on 08.12.13.
 */
public interface RoomInterface extends MovementActionInterface {
    public MovementActionInterface getNorth();

    public MovementActionInterface getEast();

    public MovementActionInterface getSouth();

    public MovementActionInterface getWest();

    public boolean hasTreasure();
}
