package de.geisslerbenjamin.patterns.structural.composite.tests;

import de.geisslerbenjamin.patterns.structural.composite.CarEngine;
import de.geisslerbenjamin.patterns.structural.composite.CompoundCarComponent;
import de.geisslerbenjamin.patterns.structural.composite.SimpleCarComponent;
import de.geisslerbenjamin.patterns.structural.composite.interfaces.ComponentInterface;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple test of the composite pattern.
 * Created by Benjamin on 22.12.13.
 */
public class CompositeTest {
    private ComponentInterface car;
    private ComponentInterface chassis;

    @Before
    public void setUp() throws Exception {
        this.car = new CompoundCarComponent();
        this.car.add(new SimpleCarComponent("Left front wheel", 100));
        this.car.add(new SimpleCarComponent("Right front wheel", 100));
        this.car.add(new SimpleCarComponent("Left back wheel", 100));
        this.car.add(new SimpleCarComponent("Right back", 100));

        this.chassis = new CompoundCarComponent();
        this.chassis.add(new SimpleCarComponent("Left front door", 150));
        this.chassis.add(new SimpleCarComponent("Right front door", 150));
        this.chassis.add(new SimpleCarComponent("Left back door", 175));
        this.chassis.add(new SimpleCarComponent("Right back door", 175));
        this.car.add(this.chassis);

        ComponentInterface engine = new CarEngine("BMW 350i");
        engine.add(new SimpleCarComponent("Cylinder", 500));
        engine.add(new SimpleCarComponent("Cylinder", 500));
        engine.add(new SimpleCarComponent("Cylinder", 500));
        engine.add(new SimpleCarComponent("Cylinder", 500));

        this.car.add(engine);
    }

    @Test
    public void calcCarPriceTest() {
        Assert.assertEquals(3050, this.car.getPrice());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Left front wheel; Right front wheel; Left back wheel; Right back; Left front door; Right front door; Left back door; Right back door; Engine: BMW 350i (Components: Cylinder; Cylinder; Cylinder; Cylinder)", this.car.getName());
    }

    @Test
    public void modifyChassisTest() throws Exception {
        Assert.assertEquals(3050, this.car.getPrice());

        SimpleCarComponent sunRoof = new SimpleCarComponent("Sun roof", 150);
        ComponentInterface carChassis = this.car.getChildren(this.chassis);
        carChassis.add(sunRoof);
        Assert.assertEquals(3200, this.car.getPrice());

        this.chassis.remove(sunRoof);
        Assert.assertEquals(3050, this.car.getPrice());
    }

    @Test(expected = Exception.class)
    public void doNotModifyTest() throws Exception {
        this.car.getChildren(new SimpleCarComponent("Sun roof", 175));
    }
}
