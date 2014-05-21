package de.geisslerbenjamin.patterns.creational.abstractfactory.interfaces;

import de.geisslerbenjamin.patterns.creational.abstractfactory.MovementException;

/**
 * Created by Benjamin on 08.12.13.
 */
public interface MovementActionInterface {
    public String getName();

    public MovementActionInterface enter() throws MovementException;
}
