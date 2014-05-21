package de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces;

/**
 * Created by Benjamin on 08.12.13.
 */
public interface MazeInterface extends MovementInterface {
    public MazeInterface addRoom(RoomInterface room);
}
