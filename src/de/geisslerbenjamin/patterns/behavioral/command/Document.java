package de.geisslerbenjamin.patterns.behavioral.command;

import de.geisslerbenjamin.patterns.behavioral.command.interfaces.DocumentInterface;
import de.geisslerbenjamin.patterns.behavioral.command.interfaces.MementoInterface;
import de.geisslerbenjamin.patterns.behavioral.command.interfaces.MementoStateInterface;

/**
 * Simple document with a font name and size, which can be changed.
 * Created by Benjamin on 13.12.13.
 */
public class Document implements DocumentInterface, MementoInterface {
    private String font;
    private int size;

    /**
     * Constructor
     *
     * @param font font name
     * @param size font size
     */
    public Document(String font, int size) {
        this.font = font;
        this.size = size;
    }

    /**
     * Get the actual font name.
     *
     * @return font name
     */
    public String getFont() {
        return this.font;
    }

    /**
     * Get the actual font size.
     *
     * @return font size
     */
    public int getSize() {
        return this.size;
    }

    @Override
    public MementoStateInterface getMementoState() {
        return new DocumentState(this.font, this.size);
    }

    @Override
    public void setMementoState(MementoStateInterface state) {
        this.font = ((DocumentState) state).getFont();
        this.size = ((DocumentState) state).getSize();
    }

    @Override
    public boolean setFont(String name) {
        this.font = name;
        return true;
    }

    @Override
    public boolean increaseFontSize(int size) {
        this.size += size;
        return true;
    }

    @Override
    public boolean decreaseFontSize(int size) {
        if (this.size - size > 0) {
            this.size -= size;
            return true;
        }

        return false;
    }
}
