package de.geisslerbenjamin.patterns.creational.abstractfactory;

import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.GameInterface;
import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.MovementActionInterface;
import de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces.RoomInterface;

/**
 * Created by Benjamin on 08.12.13.
 */
public class Game implements GameInterface {
    private RoomInterface room;

    public Game(RoomInterface room) {
        this.room = room;
    }

    @Override
    public void whatIsHere() {
        System.out.println("In the north is");
        this.whatIsInTheNorth();
        System.out.println("In the east is");
        this.whatIsInTheEast();
        System.out.println("In the south is");
        this.whatIsInTheSouth();
        System.out.println("In the west is");
        this.whatIsInTheWest();
    }

    @Override
    public void whatIsInTheNorth() {
        System.out.println(this.room.getNorth().getName());
    }

    @Override
    public void enterNorth() {
        this.enter(this.room.getNorth());
    }

    @Override
    public void whatIsInTheEast() {
        System.out.println(this.room.getEast().getName());
    }

    @Override
    public void enterEast() {
        this.enter(this.room.getEast());
    }

    @Override
    public void whatIsInTheSouth() {
        System.out.println(this.room.getSouth().getName());
    }

    @Override
    public void enterSouth() {
        this.enter(this.room.getSouth());
    }

    @Override
    public void whatIsInTheWest() {
        System.out.println(this.room.getWest().getName());
    }

    @Override
    public void enterWest() {
        this.enter(this.room.getWest());
    }

    private void enter(MovementActionInterface room) {
        try {
            this.room = (RoomInterface) room.enter();
        } catch (MovementException error) {
            System.err.println(error.getMessage());
        }
    }
}
