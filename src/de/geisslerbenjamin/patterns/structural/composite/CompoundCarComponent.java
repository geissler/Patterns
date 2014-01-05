package de.geisslerbenjamin.patterns.structural.composite;

import de.geisslerbenjamin.patterns.structural.composite.interfaces.ComponentInterface;

import java.util.ArrayList;

/**
 * Compound component which implements the different methods to handle child elements.
 * Created by Benjamin on 22.12.13.
 */
public class CompoundCarComponent extends AbstractCarComponent {
    protected ArrayList<ComponentInterface> children;

    /**
     * Constructor.
     */
    public CompoundCarComponent() {
        this.children = new ArrayList<ComponentInterface>();
    }

    @Override
    public String getName() {
        StringBuilder name = new StringBuilder();
        boolean first = true;
        String splitter = "; ";

        for (ComponentInterface leaf : this.children) {
            if (!first) {
                name.append(splitter);
            }
            name.append(leaf.getName());
            first = false;
        }


        return name.toString();
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (ComponentInterface leaf : this.children) {
            sum += leaf.getPrice();
        }

        return sum;
    }

    @Override
    public ComponentInterface add(ComponentInterface component) {
        this.children.add(component);
        return this;
    }

    @Override
    public ComponentInterface remove(ComponentInterface component) {
        this.children.remove(component);
        return this;
    }

    @Override
    public ComponentInterface getChildren(ComponentInterface component) throws Exception {
        if (this.children.contains(component)) {
            return this.children.get(this.children.indexOf(component));
        }

        for (ComponentInterface element : this.children) {
            try {
                return element.getChildren(component);
            } catch (Exception error) {
                //
            }
        }

        throw new Exception("Component could not be found!");
    }

    @Override
    public ArrayList<ComponentInterface> getAllChildren() throws Exception {
        return this.children;
    }
}
