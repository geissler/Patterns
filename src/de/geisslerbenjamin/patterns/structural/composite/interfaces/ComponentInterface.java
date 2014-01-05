package de.geisslerbenjamin.patterns.structural.composite.interfaces;

import java.util.ArrayList;

/**
 * Main interface defining all methods available for components (= leaf) and compounds. Other classes working with the
 * car compound "tree" use this interface to access all of its elements.
 * Created by Benjamin on 22.12.13.
 */
public interface ComponentInterface {
    /**
     * Name of the element
     *
     * @return name
     */
    public String getName();

    /**
     * Price of the element
     *
     * @return price
     */
    public int getPrice();

    /**
     * Add an component or compound to an compound.
     *
     * @param component new component or compound
     * @return self
     * @throws Exception
     */
    public ComponentInterface add(ComponentInterface component) throws Exception;

    /**
     * Remove an component or compound to an compound.
     *
     * @param component new component or compound
     * @return self
     * @throws Exception
     */
    public ComponentInterface remove(ComponentInterface component) throws Exception;

    /**
     * Access a component or compound element in the actual compound.
     *
     * @param component component or compound
     * @return component
     * @throws Exception
     */
    public ComponentInterface getChildren(ComponentInterface component) throws Exception;

    /**
     * Access all child elements.
     *
     * @return children
     * @throws Exception
     */
    public ArrayList<ComponentInterface> getAllChildren() throws Exception;
}
