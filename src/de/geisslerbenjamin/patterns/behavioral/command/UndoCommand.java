package de.geisslerbenjamin.patterns.behavioral.command;

import de.geisslerbenjamin.patterns.behavioral.command.interfaces.DocumentInterface;
import de.geisslerbenjamin.patterns.behavioral.command.interfaces.MementoInterface;

/**
 * A command which tries to return to the last state of the document by injecting the last documente state form the
 * document history into the document.
 * Created by Benjamin on 13.12.13.
 */
public class UndoCommand extends AbstractDocumentCommand {
    /**
     * Constructor.
     *
     * @param history document history store
     */
    public UndoCommand(DocumentHistory history) {
        super(history);
    }

    @Override
    public boolean execute(DocumentInterface document) {
        try {
            ((MementoInterface) document).setMementoState(this.getLastState());
            return true;
        } catch (Exception error) {
            System.err.println(error.getMessage());
            return false;
        }

    }
}
