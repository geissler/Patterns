package de.geisslerbenjamin.patterns.behavioral.visitor.interfaces;

/**
 * Defines the accept method to receive a visitor.
 * Created by Benjamin on 23.12.13.
 */
public interface VisitableInterface {
    /**
     * Inject a visitor and call the corresponding method for the actual class in the visitor and inject the actual
     * class into the visitor.
     *
     * @param visitor visitor
     */
    public void accept(VisitorInterface visitor);
}
