package de.geisslerbenjamin.patterns.commandpattern;

import de.geisslerbenjamin.patterns.commandpattern.interfaces.MementoStateInterface;

/**
 * A simple object encapsulating the actual state of a document.
 * Created by Benjamin on 13.12.13.
 */
public class DocumentState implements MementoStateInterface {
    private String font;
    private int size;

    /**
     * Constructor
     *
     * @param font font size
     * @param size font name
     */
    public DocumentState(String font, int size) {
        this.font = font;
        this.size = size;
    }

    /**
     * Get the font name of the state.
     *
     * @return font name
     */
    public String getFont() {
        return font;
    }

    /**
     * Get the font size of the state.
     *
     * @return font size
     */
    public int getSize() {
        return size;
    }
}
