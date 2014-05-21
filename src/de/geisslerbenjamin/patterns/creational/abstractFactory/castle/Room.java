package de.geisslerbenjamin.patterns.creational.abstractfactory.castle;

import de.geisslerbenjamin.patterns.creational.abstractfactory.MovementException;
import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.MovementActionInterface;
import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.RoomInterface;

/**
 * Created by Benjamin on 10.12.13.
 */
public class Room implements RoomInterface {
    private MovementActionInterface north;
    private MovementActionInterface east;
    private MovementActionInterface south;
    private MovementActionInterface west;
    private boolean treasure;
    private String name;

    public Room(MovementActionInterface north, MovementActionInterface east, MovementActionInterface south, MovementActionInterface west, boolean treasure, String name) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.treasure = treasure;
        this.name = name;
    }

    @Override
    public MovementActionInterface getNorth() {
        return this.north;
    }

    @Override
    public MovementActionInterface getEast() {
        return this.east;
    }

    @Override
    public MovementActionInterface getSouth() {
        return this.south;
    }

    @Override
    public MovementActionInterface getWest() {
        return this.west;
    }

    @Override
    public boolean hasTreasure() {
        return this.treasure;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public MovementActionInterface enter() throws MovementException {
        System.out.println("You entered the room '" + this.name + "'");
        return this;
    }
}
