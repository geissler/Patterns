package de.geisslerbenjamin.patterns.commandpattern;

import de.geisslerbenjamin.patterns.commandpattern.interfaces.CommandInterface;
import de.geisslerbenjamin.patterns.commandpattern.interfaces.DocumentInterface;

/**
 * Simple "Menu" element, which executes the injected command
 * Created by Benjamin on 13.12.13.
 */
public class MenuElement {
    private String name;
    private CommandInterface command;
    private DocumentInterface document;

    /**
     * Constructor.
     *
     * @param name     menu name
     * @param command  command to execute
     * @param document document to execute command on
     */
    public MenuElement(String name, CommandInterface command, DocumentInterface document) {
        this.command = command;
        this.document = document;
    }

    /**
     * Execute the injected command.
     */
    public void click() {
        this.command.execute(this.document);
    }
}
