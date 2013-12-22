package de.geisslerbenjamin.patterns.commandpattern;

import de.geisslerbenjamin.patterns.commandpattern.interfaces.DocumentInterface;

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
