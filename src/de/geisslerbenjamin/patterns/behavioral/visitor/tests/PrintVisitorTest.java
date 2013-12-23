package de.geisslerbenjamin.patterns.behavioral.visitor.tests;

import de.geisslerbenjamin.patterns.behavioral.visitor.PrintVisitor;
import de.geisslerbenjamin.patterns.behavioral.visitor.SingleVisitableCarComponent;
import de.geisslerbenjamin.patterns.behavioral.visitor.VisitableCarCompound;
import de.geisslerbenjamin.patterns.behavioral.visitor.Wheel;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple test for PrintVisitor.
 * Created by Benjamin on 23.12.13.
 */
public class PrintVisitorTest {
    protected VisitableCarCompound car;
    protected PrintVisitor visitor;

    @Before
    public void setUp() {
        this.visitor = new PrintVisitor();

        this.car = new VisitableCarCompound("BMW 350i turbo", 100);
        this.car.add(new Wheel("Left front wheel", 100));
        this.car.add(new Wheel("Right front wheel", 100));

        VisitableCarCompound engine = new VisitableCarCompound("Turbo engine", 250);
        engine.add(new SingleVisitableCarComponent("Cylinder 1", 300));
        engine.add(new SingleVisitableCarComponent("Cylinder 2", 300));
        this.car.add(engine);

        this.car.add(new SingleVisitableCarComponent("BMW logo", 25));
    }

    @Test
    public void printTest() {

        this.car.accept(this.visitor);
        Assert.assertEquals("BMW 350i turbo\n" +
                "   Left front wheel\n" +
                "   Right front wheel\n" +
                "   Turbo engine\n" +
                "      Cylinder 1\n" +
                "      Cylinder 2\n" +
                "   BMW logo\n", this.visitor.getResult());
    }
}
