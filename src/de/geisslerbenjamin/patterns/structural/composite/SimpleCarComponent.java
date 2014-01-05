package de.geisslerbenjamin.patterns.structural.composite;

/**
 * Simple car component.
 * Created by Benjamin on 22.12.13.
 */
public class SimpleCarComponent extends AbstractCarComponent {
    private String name;
    private int price;

    /**
     * Constructor.
     *
     * @param name  name of the component
     * @param price price of the component
     */
    public SimpleCarComponent(String name, int price) {
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
}
