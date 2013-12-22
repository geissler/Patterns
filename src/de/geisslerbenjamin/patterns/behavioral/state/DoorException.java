package de.geisslerbenjamin.patterns.behavioral.state;

/**
 * Simple Exception.
 * Created by Benjamin on 06.12.13.
 */
public class DoorException extends Error {
    public DoorException(String s) {
        System.out.println(s);
    }
}
