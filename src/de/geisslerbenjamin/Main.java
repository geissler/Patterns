package de.geisslerbenjamin;

import de.geisslerbenjamin.patterns.behavioral.observer.*;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.BellInterface;
import de.geisslerbenjamin.patterns.behavioral.observer.interfaces.PersonInterface;
import de.geisslerbenjamin.patterns.behavioral.state.Door;
import de.geisslerbenjamin.patterns.behavioral.state.Key;
import de.geisslerbenjamin.patterns.behavioral.state.OpenDoor;
import de.geisslerbenjamin.patterns.behavioral.state.interfaces.DoorActionInterface;
import de.geisslerbenjamin.patterns.behavioral.state.interfaces.KeyInterface;

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

        System.out.println("\n\n\nTest Observer Pattern");
        BellInterface bell = new Bell(true);
        PersonInterface tom = new Person("Tom");
        PersonInterface jack = new Person("Jack");
        PersonInterface benjamin = new Person("Benjamin");
        Camera camera = new Camera();
        camera
                .addOwner(benjamin)
                .addObserver(new AutomaticDoor());

        bell
                .addObserver(new Caller())
                .addObserver(new Security(2))
                .addObserver(camera);
        bell
                .push(tom)
                .push(jack)
                .push(jack)
                .push(jack)
                .push(jack)
                .push(tom)
                .push(benjamin)
                .push(jack);

    }
}
