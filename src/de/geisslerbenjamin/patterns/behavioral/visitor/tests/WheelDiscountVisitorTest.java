package de.geisslerbenjamin.patterns.behavioral.visitor.tests;

import de.geisslerbenjamin.patterns.behavioral.visitor.SingleVisitableCarComponent;
import de.geisslerbenjamin.patterns.behavioral.visitor.VisitableCarCompound;
import de.geisslerbenjamin.patterns.behavioral.visitor.Wheel;
import de.geisslerbenjamin.patterns.behavioral.visitor.WheelDiscountVisitor;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple discount calculator test.
 * Created by Benjamin on 23.12.13.
 */
public class WheelDiscountVisitorTest {
    protected VisitableCarCompound car;
    protected WheelDiscountVisitor visitor;

    @Before
    public void setUp() {
        this.visitor = new WheelDiscountVisitor(25);

        this.car = new VisitableCarCompound("BMW 350i turbo", 100);
        this.car.add(new Wheel("Left front wheel", 100));
        this.car.add(new Wheel("Right front wheel", 100));
        this.car.add(new Wheel("Left back wheel", 100));
        this.car.add(new Wheel("Right back wheel", 100));

        VisitableCarCompound engine = new VisitableCarCompound("Turbo engine", 275);
        engine.add(new SingleVisitableCarComponent("Cylinder 1", 300));
        engine.add(new SingleVisitableCarComponent("Cylinder 2", 300));
        this.car.add(engine);

        this.car.add(new SingleVisitableCarComponent("BMW logo", 25));
    }

    @Test
    public void calcDiscountTest() {
        this.car.accept(this.visitor);
        Assert.assertEquals((float) 1300, this.visitor.getPrice());
    }
}
