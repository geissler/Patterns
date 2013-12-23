package de.geisslerbenjamin.patterns.behavioral.visitor;

import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitableInterface;
import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitorInterface;
import de.geisslerbenjamin.patterns.structural.composite.SimpleCarComponent;

/**
 * Simple car component, which extends the car component from the composite pattern and adds the accept method for
 * the visitor.
 * Created by Benjamin on 23.12.13.
 */
public class SingleVisitableCarComponent extends SimpleCarComponent implements VisitableInterface {
    /**
     * Constructor
     *
     * @param name  name of component
     * @param price price of component
     */
    public SingleVisitableCarComponent(String name, int price) {
        super(name, price);
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visitComponent(this);
    }
}
