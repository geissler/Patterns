package de.geisslerbenjamin;

import de.geisslerbenjamin.patterns.statepattern.Door;
import de.geisslerbenjamin.patterns.statepattern.Key;
import de.geisslerbenjamin.patterns.statepattern.OpenDoor;
import de.geisslerbenjamin.patterns.statepattern.interfaces.DoorActionInterface;
import de.geisslerbenjamin.patterns.statepattern.interfaces.KeyInterface;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test State Pattern");
        KeyInterface myKey = new Key(123);
        DoorActionInterface myDoor = new Door(new OpenDoor(myKey));

        System.out.println("Is my door open? " + myDoor.isOpen());
        System.out.println("Close door");
        myDoor.close();
        System.out.println("Is my door open? " + myDoor.isOpen());
        System.out.println("Lock door");
        myDoor.lock(myKey);
        System.out.println("Is my door locked? " + myDoor.isLocked());
        System.out.println("Open door");
        myDoor.open();
        System.out.println("Unlock door");
        myDoor.unlock(new Key(445));
        System.out.println("Unlock door");
        myDoor.unlock(myKey);
        System.out.println("Is my door locked? " + myDoor.isLocked());
        System.out.println("Is my door open? " + myDoor.isOpen());
        System.out.println("Open door");
        myDoor.open();
        System.out.println("Is my door open? " + myDoor.isOpen());
    }
}
