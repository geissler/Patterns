package de.geisslerbenjamin.patterns.statepattern;

import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;

/**
 * Simple door key class.
 * Created by Benjamin on 06.12.13.
 */
public class Key implements KeyInterface {
    private int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return this.number;
    }
}
