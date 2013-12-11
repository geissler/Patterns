package de.geisslerbenjamin.patterns.mediatorpattern;

import de.geisslerbenjamin.patterns.mediatorpattern.interfaces.MediatorInterface;

/**
 * Small test file
 * Created by Benjamin on 11.12.13.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator pattern");

        MediatorInterface room1 = new ChatRoom();
        new UserLog(room1);

        User jack = new User("jack", room1);
        jack.write("Hello?");
        User tom = new User("tom", room1);
        tom.write("Hello everybody!");
        jack.write("nice to see you");
        User sarah = new User("sarah", room1);
        sarah.writeTo("Hi :-)", "jack");
        sarah.write("Good evening folks...");
        tom.quit();
        sarah.write("How are you?");
        jack.writeTo("Fine and you?", "sarah");
    }
}
