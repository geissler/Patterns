package de.geisslerbenjamin.patterns.structural.composite;

import de.geisslerbenjamin.patterns.structural.composite.interfaces.ComponentInterface;

import java.util.ArrayList;

/**
 * Abstract base class which implements all methods to access the components and it's children by throwing an exception
 * for every access attempt. The concrete class's must override the methods of the interface.
 * Created by Benjamin on 22.12.13.
 */
abstract public class AbstractCarComponent implements ComponentInterface {
    @Override
    public ComponentInterface add(ComponentInterface component) throws Exception {
        throw new Exception("Could not add component");
    }

    @Override
    public ComponentInterface remove(ComponentInterface component) throws Exception {
        throw new Exception("Could not remove component");
    }

    @Override
    public ComponentInterface getChildren(ComponentInterface component) throws Exception {
        throw new Exception("Could not find component");
    }

    @Override
    public ArrayList<ComponentInterface> getAllChildren() throws Exception {
        throw new Exception("Could not find components");
    }
}
