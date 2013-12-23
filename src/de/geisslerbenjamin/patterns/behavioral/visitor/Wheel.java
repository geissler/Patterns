package de.geisslerbenjamin.patterns.behavioral.visitor;

import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitorInterface;

/**
 * Simple "special" component class, to calculate a discount.
 * Created by Benjamin on 23.12.13.
 */
public class Wheel extends SingleVisitableCarComponent {
    public Wheel(String name, int price) {
        super(name, price);
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visitWheel(this);
    }
}
