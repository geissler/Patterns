package de.geisslerbenjamin.patterns.observer;

import de.geisslerbenjamin.patterns.observer.interfaces.PersonInterface;

/**
 * Simple person implementation.
 * Created by Benjamin on 08.12.13.
 */
public class Person implements PersonInterface {
    private String name;

    /**
     * Set the name
     *
     * @param name name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
