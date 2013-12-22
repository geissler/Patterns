package de.geisslerbenjamin.patterns.commandpattern;

import de.geisslerbenjamin.patterns.commandpattern.interfaces.CommandInterface;
import de.geisslerbenjamin.patterns.commandpattern.interfaces.DocumentInterface;

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
