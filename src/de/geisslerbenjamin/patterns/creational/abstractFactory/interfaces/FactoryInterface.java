package de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces;

/**
 * Created by Benjamin on 08.12.13.
 */
public interface FactoryInterface {
    public WallInterface createWall();

    public DoorInterface createDoor(RoomInterface from, RoomInterface to);

    public RoomInterface createRoom(MovementActionInterface north, MovementActionInterface east, MovementActionInterface south, MovementActionInterface west, boolean treasure, String name);
}
