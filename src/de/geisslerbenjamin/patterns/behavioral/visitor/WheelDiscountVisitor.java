package de.geisslerbenjamin.patterns.behavioral.visitor;

import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitableInterface;
import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitorInterface;
import de.geisslerbenjamin.patterns.structural.composite.interfaces.ComponentInterface;

/**
 * Calculates the price of a car, where wheels get a certain amount of discount on there single price.
 * Created by Benjamin on 23.12.13.
 */
public class WheelDiscountVisitor implements VisitorInterface {
    private float price;
    private float discount;

    /**
     * Constructor
     *
     * @param discount the percent of discount on a wheel
     */
    public WheelDiscountVisitor(float discount) {
        this.price = 0;
        this.discount = discount;
    }

    /**
     * Get the price.
     *
     * @return the calculated price
     */
    public float getPrice() {
        return price;
    }

    @Override
    public void visitWheel(Wheel wheel) {
        float reduceBy = (wheel.getPrice() / 100) * this.discount;
        this.price += (wheel.getPrice() - reduceBy);
    }

    @Override
    public void visitCompound(VisitableCarCompound visitableCarCompound) {
        this.price += visitableCarCompound.getPrice();

        try {
            for (ComponentInterface children : visitableCarCompound.getAllChildren()) {
                VisitableInterface visitChild = (VisitableInterface) children;
                visitChild.accept(this);
            }
        } catch (Exception error) {
            // error handling ...
        }
    }

    @Override
    public void visitComponent(SingleVisitableCarComponent component) {
        this.price += component.getPrice();
    }
}
