package de.geisslerbenjamin.patterns.behavioral.command.interfaces;

/**
 * Simple document interface.
 * Created by Benjamin on 13.12.13.
 */
public interface DocumentInterface {
    /**
     * Change the font name.
     *
     * @param name font name
     * @return if font name was successfully changed
     */
    public boolean setFont(String name);

    /**
     * Increase the font size.
     *
     * @param size font size
     * @return if increase was successful
     */
    public boolean increaseFontSize(int size);

    /**
     * Decrease the font size.
     *
     * @param size font size
     * @return if decrease was successful
     */
    public boolean decreaseFontSize(int size);
}
