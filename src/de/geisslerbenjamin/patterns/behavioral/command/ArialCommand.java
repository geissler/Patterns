package de.geisslerbenjamin.patterns.behavioral.command;

import de.geisslerbenjamin.patterns.behavioral.command.interfaces.DocumentInterface;

/**
 * Simple test command.
 * Created by Benjamin on 13.12.13.
 */
public class ArialCommand extends AbstractDocumentCommand {
    /**
     * Constructor
     *
     * @param history document history store
     */
    public ArialCommand(DocumentHistory history) {
        super(history);
    }

    @Override
    public boolean execute(DocumentInterface document) {
        this.addState(document);
        return document.setFont("Arial");
    }
}
