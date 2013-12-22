package de.geisslerbenjamin.patterns.commandpattern;

import de.geisslerbenjamin.patterns.commandpattern.interfaces.MementoStateInterface;

import java.util.ArrayList;

/**
 * Simple document history, which holds the states of the command run on a document.
 * Created by Benjamin on 13.12.13.
 */
public class DocumentHistory {
    private ArrayList<MementoStateInterface> done;
    private ArrayList<MementoStateInterface> undone;

    public DocumentHistory() {
        this.done = new ArrayList<MementoStateInterface>();
        this.undone = new ArrayList<MementoStateInterface>();
    }

    /**
     * Add an state of an document to the history stack.
     *
     * @param state actual document state
     */
    public void addDocumentState(MementoStateInterface state) {
        this.done.add(state);
    }

    /**
     * Receive the last state of the history stack, remove it from the done stack and put it on the undone stack.
     *
     * @return The state to which the document should return
     * @throws Exception
     */
    public MementoStateInterface undoLast() throws Exception {
        if (this.done.size() > 0) {
            MementoStateInterface state = this.done.get(this.done.size() - 1);
            this.done.remove(state);
            this.undone.add(state);
            return state;
        }

        throw new Exception("There is no 'done'-element existing!");
    }

    /**
     * Receive the last state of the undone history stack, remove it from the undone stack and put it on the done stack.
     *
     * @return The state to which the document should return
     * @throws Exception
     */
    public MementoStateInterface redoLast() throws Exception {
        if (this.done.size() > 0) {
            MementoStateInterface state = this.undone.get(this.undone.size() - 1);
            this.undone.remove(state);
            this.done.add(state);
            return state;
        }

        throw new Exception("There is no 'redo'-element existing!");
    }
}
