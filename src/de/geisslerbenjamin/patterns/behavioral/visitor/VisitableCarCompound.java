package de.geisslerbenjamin.patterns.behavioral.visitor;

import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitableInterface;
import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitorInterface;
import de.geisslerbenjamin.patterns.structural.composite.CompoundCarComponent;

/**
 * Collection of multiple simple car components from the composite pattern with an additional accept method for a
 * visitor.
 * Created by Benjamin on 23.12.13.
 */
public class VisitableCarCompound extends CompoundCarComponent implements VisitableInterface {
    protected String name;
    private int price;

    /**
     * Constructor
     *
     * @param name  name
     * @param price price
     */
    public VisitableCarCompound(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visitCompound(this);
    }
}
