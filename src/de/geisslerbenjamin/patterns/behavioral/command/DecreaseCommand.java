package de.geisslerbenjamin.patterns.behavioral.command;

import de.geisslerbenjamin.patterns.behavioral.command.interfaces.CommandInterface;
import de.geisslerbenjamin.patterns.behavioral.command.interfaces.DocumentInterface;

/**
 * Simple command to decrease the font size in the document.
 * Created by Benjamin on 13.12.13.
 */
public class DecreaseCommand extends AbstractDocumentCommand implements CommandInterface {
    private int size = 2;

    /**
     * Constructor
     *
     * @param history document history store
     */
    public DecreaseCommand(DocumentHistory history) {
        super(history);
    }

    @Override
    public boolean execute(DocumentInterface document) {
        this.addState(document);
        return document.decreaseFontSize(this.size);
    }
}
