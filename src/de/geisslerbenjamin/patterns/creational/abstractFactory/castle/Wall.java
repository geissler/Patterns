package de.geisslerbenjamin.patterns.creational.abstractfactory.castle;

import de.geisslerbenjamin.patterns.creational.abstractfactory.MovementException;
import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.MovementActionInterface;
import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.WallInterface;

/**
 * A wall in a castle
 * Created by Benjamin on 08.12.13.
 */
public class Wall implements WallInterface {
    private String color;

    public Wall(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return "A beautiful " + this.color + " stone wall";
    }

    @Override
    public MovementActionInterface enter() throws MovementException {
        throw new MovementException("You can't walk through walls!");
    }
}
