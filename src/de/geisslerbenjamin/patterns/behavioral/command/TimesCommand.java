package de.geisslerbenjamin.patterns.behavioral.command;

import de.geisslerbenjamin.patterns.behavioral.command.interfaces.DocumentInterface;

/**
 * Test command to change the font name,
 * Created by Benjamin on 13.12.13.
 */
public class TimesCommand extends AbstractDocumentCommand {
    /**
     * Constructor
     *
     * @param history document history store
     */
    public TimesCommand(DocumentHistory history) {
        super(history);
    }

    @Override
    public boolean execute(DocumentInterface document) {
        this.addState(document);
        return document.setFont("Times New Roman");
    }
}
