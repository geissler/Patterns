package de.geisslerbenjamin.patterns.commandpattern;

import de.geisslerbenjamin.patterns.commandpattern.interfaces.CommandInterface;
import de.geisslerbenjamin.patterns.commandpattern.interfaces.DocumentInterface;

/**
 * Simple increase font size command.
 * Created by Benjamin on 13.12.13.
 */
public class IncreaseCommand extends AbstractDocumentCommand implements CommandInterface {
    /**
     * Constructor.
     *
     * @param history document history store
     */
    public IncreaseCommand(DocumentHistory history) {
        super(history);
    }

    @Override
    public boolean execute(DocumentInterface document) {
        this.addState(document);
        return document.increaseFontSize(2);
    }
}
