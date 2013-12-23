package de.geisslerbenjamin.patterns.behavioral.visitor;

import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitableInterface;
import de.geisslerbenjamin.patterns.behavioral.visitor.interfaces.VisitorInterface;
import de.geisslerbenjamin.patterns.structural.composite.interfaces.ComponentInterface;

/**
 * Print the different elements of a car, where are children elements of compounds are displayed EINGERÜCKT.
 * Created by Benjamin on 23.12.13.
 */
public class PrintVisitor implements VisitorInterface {
    private StringBuilder printer;
    private String prefix = "   ";
    private int repeatPrefix = 0;

    /**
     * Constructor
     */
    public PrintVisitor() {
        this.printer = new StringBuilder();
    }

    @Override
    public void visitWheel(Wheel wheel) {
        this.print(wheel.getName());
    }

    @Override
    public void visitCompound(VisitableCarCompound visitableCarCompound) {
        this.print(visitableCarCompound.getName());
        this.repeatPrefix++;

        try {
            for (ComponentInterface children : visitableCarCompound.getAllChildren()) {
                VisitableInterface visitChild = (VisitableInterface) children;
                visitChild.accept(this);
            }
            this.repeatPrefix--;
        } catch (Exception error) {
            // error handling..
        }
    }

    @Override
    public void visitComponent(SingleVisitableCarComponent component) {
        this.print(component.getName());
    }

    /**
     * Get the result
     *
     * @return the string to print
     */
    public String getResult() {
        return this.printer.toString();
    }

    /**
     * Print the component name and add, if needed some prefixes.
     *
     * @param value name of the component
     */
    private void print(String value) {
        int repeat = 0;
        while (repeat < this.repeatPrefix) {
            this.printer.append(this.prefix);
            repeat++;
        }

        this
                .printer
                .append(value)
                .append("\n");
    }
}
