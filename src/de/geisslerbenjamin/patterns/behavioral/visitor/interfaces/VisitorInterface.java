package de.geisslerbenjamin.patterns.behavioral.visitor.interfaces;


import de.geisslerbenjamin.patterns.behavioral.visitor.SingleVisitableCarComponent;
import de.geisslerbenjamin.patterns.behavioral.visitor.VisitableCarCompound;
import de.geisslerbenjamin.patterns.behavioral.visitor.Wheel;

/**
 * Define the methods to handle different types of classes inside the visitor. Each visited class calls its
 * corresponding method.
 * Created by Benjamin on 23.12.13.
 */
public interface VisitorInterface {
    /**
     * Handle the visit of a wheel.
     *
     * @param wheel wheel
     */
    public void visitWheel(Wheel wheel);

    /**
     * Handle the visit of a compound and its child elements.
     *
     * @param visitableCarCompound compound
     */
    public void visitCompound(VisitableCarCompound visitableCarCompound);

    /**
     * Handle the visit of a simple component without further parameters.
     *
     * @param component simple component
     */
    public void visitComponent(SingleVisitableCarComponent component);
}
