package de.geisslerbenjamin.patterns.behavioral.command;

import de.geisslerbenjamin.patterns.behavioral.command.interfaces.CommandInterface;
import de.geisslerbenjamin.patterns.behavioral.command.interfaces.DocumentInterface;
import de.geisslerbenjamin.patterns.behavioral.command.interfaces.MementoInterface;

/**
 * Abstract command, which implements the methods needed for the memento state change.
 * Created by Benjamin on 13.12.13.
 */
abstract public class AbstractDocumentCommand implements CommandInterface {
    private DocumentHistory history;

    /**
     * Constructor
     *
     * @param history document history store
     */
    public AbstractDocumentCommand(DocumentHistory history) {
        this.history = history;
    }

    /**
     * Add the actual state of the document to the history of the document.
     *
     * @param document actual document state
     */
    protected void addState(DocumentInterface document) {
        this.history.addDocumentState(((MementoInterface) document).getMementoState());
    }

    /**
     * Receive the state of the last command run on the document.
     *
     * @return last state of the document
     * @throws Exception
     */
    protected DocumentState getLastState() throws Exception {
        return (DocumentState) this.history.undoLast();
    }
}
