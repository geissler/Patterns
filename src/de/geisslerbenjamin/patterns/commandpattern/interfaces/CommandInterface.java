package de.geisslerbenjamin.patterns.commandpattern.interfaces;

/**
 * A command which executes the necessary methods on the given document.
 * Created by Benjamin on 12.12.13.
 */
public interface CommandInterface {
    /**
     * Execute a command on the given document.
     *
     * @param document document to run command on
     * @return if command was successfully executed
     */
    public boolean execute(DocumentInterface document);
}
